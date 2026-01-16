package com.practice.example.Controller;

import com.practice.example.Model.User;
import com.practice.example.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService user;
    @RequestMapping("/user")
    public List<User> getUser(){
        return user.getUser();
    }
}
