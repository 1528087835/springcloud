package com.it.dao;

import com.it.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDao {

    public User queryUserById(int id);
}
