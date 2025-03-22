package com.example.service;

import com.example.entity.Users;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    public List<Users> getUsers();

    public Users getUserById(int id);

    public Users createUser(Users user);


}
