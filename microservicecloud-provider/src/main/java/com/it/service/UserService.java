package com.it.service;

import com.it.entity.User;

public interface UserService {

    public User queryUserById(int id);

    public void addUser(User user);
}
