package com.iotek.service.impl;

import com.iotek.dao.UserMapper;
import com.iotek.model.User;
import com.iotek.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by thinkpad on 2018/7/25.
 */
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;

    public User loginUser(User user) {
        return userMapper.loginUser(user);
    }

    public User getUserByName(User user) {
        return userMapper.getUserByName(user);
    }

    public void registerUser(User user) {
        userMapper.registerUser(user);
    }
}
