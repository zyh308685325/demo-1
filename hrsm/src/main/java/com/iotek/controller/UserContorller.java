package com.iotek.controller;

import com.iotek.model.User;
import com.iotek.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

/**
 * Created by thinkpad on 2018/7/25.
 */
@Controller
public class UserContorller {
    @Resource private UserService userService;
    @RequestMapping("/login")
    public String login(String loginUser,User user,String register,HttpSession session){
        if (loginUser!=null){
            User user1=userService.loginUser(user);
            if (user1!=null){
                session.setAttribute("user",user1);
                return "success";
            }
        }
        if (register!=null){
           return "register";
        }
        return "../../login";
    }
    @RequestMapping("/register")
    public String register(User user,HttpSession session){
       User user1=userService.getUserByName(user);
       if (user1!=null){
           session.setAttribute("error","用户名重复");
           return "register";
       }else {
           userService.registerUser(user);
           return "../../login";
       }
    }
}
