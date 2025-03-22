package com.example.service;

import com.example.dao.UserDao;
import com.example.entity.Users;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserServiceImpl implements UserService{

    @Autowired
    UserDao userDao;

    @Override
    public List<Users> getUsers() {
        userDao.getUsers();
    }

    @Override
    public Users getUserById(int id) {
        return null;
    }

    @Override
    public Users createUser(Users user) {
        return null;
    }
}
