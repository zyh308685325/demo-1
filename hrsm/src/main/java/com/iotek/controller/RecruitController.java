package com.iotek.controller;

import com.iotek.model.Recruit;
import com.iotek.model.User;
import com.iotek.service.RecruitService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by thinkpad on 2018/7/30.
 */
@Controller
public class RecruitController {
    @Resource private RecruitService recruitService;

    @RequestMapping("/")
    public String show(HttpSession session){
        List<Recruit> recruits=recruitService.showRecruit();
        session.setAttribute("recr",recruits);
        return "../../login";
    }
    @RequestMapping("/mailing")
    public String mailing(String mail ,HttpSession session){
        User user1= (User) session.getAttribute("user");
        if (user1==null){
            session.setAttribute("Mailerror","ÇëµÇÂ¼");
            return "../../login";
        }else {
         return "resume";
        }
    }

    @RequestMapping("/getResume")
    public String getResume(){
        return "getResume";
    }
}
