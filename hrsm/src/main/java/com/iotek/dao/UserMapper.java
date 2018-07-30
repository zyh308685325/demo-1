package com.iotek.dao;

import com.iotek.model.User;

/**
 * Created by thinkpad on 2018/7/25.
 */
public interface UserMapper {
    User loginUser(User user);
    User getUserByName(User user);
    void registerUser(User user);
}
