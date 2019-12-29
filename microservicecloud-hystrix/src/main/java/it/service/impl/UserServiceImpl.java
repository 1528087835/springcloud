package it.service.impl;

import com.it.entity.User;
import it.dao.UserDao;
import it.service.UserService;
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

    @Override
    public void addUser(User user) {
        userDao.addUser(user);
       // int i=10/0;
        add();
    }

    public void add(){
        int i=10/0;
    }
}
