package com.vlluvia.service.impl;


import com.vlluvia.UserService;
import com.vlluvia.dao.UserDao;

public class UserServiceImpl implements UserService {

    private UserDao userDao;
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void save() {
        userDao.save();
    }
}
