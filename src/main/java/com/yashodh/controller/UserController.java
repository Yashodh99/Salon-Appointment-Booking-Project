package com.yashodh.controller;

import com.yashodh.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {


    @GetMapping("/api/users")
    public User getUser(){
        User user = new User();
        user.setEmail("hulk@gmail.com");
        user.setFullName("efefef");
        user.setPhone("+78 925578943");
        user.setRole("Customer");
        return user;


    }
}
