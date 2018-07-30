package com.iotek.service;

import com.iotek.model.User;

/**
 * Created by thinkpad on 2018/7/25.
 */
public interface UserService {
    User loginUser(User user);
    User getUserByName(User user);
    void registerUser(User user);
}
