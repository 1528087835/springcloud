package com.it.service.impl;

import com.it.dao.UserDao;
import com.it.entity.User;
import com.it.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {


    @Autowired
    private UserDao userDao;
    @Override
    public User queryUserById(int id) {
        return userDao.queryUserById(id);
    }
}
