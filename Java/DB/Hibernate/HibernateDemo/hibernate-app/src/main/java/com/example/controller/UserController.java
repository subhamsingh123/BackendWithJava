package com.example.controller;


import com.example.entity.Users;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/Users")
    public List<Users> getUsers(){
    List<Users> users = userService.getUsers();
    return users;

    }

    @PostMapping("/CreateUser")
    public ResponseEntity<String> createUser(@RequestBody Users user){
    userService.createUser(user);
    return ResponseEntity.ok("User created: " + user.toString());
    }

    @PostMapping("/User/{id}")
    public ResponseEntity<String> getUserById(@RequestParam int id){

        return ResponseEntity.ok("User details for ID " + id);

    }




}
