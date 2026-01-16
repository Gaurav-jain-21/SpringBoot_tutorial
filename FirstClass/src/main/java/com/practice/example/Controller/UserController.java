package com.practice.example.Controller;

import com.practice.example.Model.User;
import com.practice.example.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService user;
    @RequestMapping("/user")
    public List<User> getUser(){
        return user.getUser();
    }
    @GetMapping("/user/{id}")
    public User getUserById(@PathVariable int id){
        return user.getUserById(id);
    }
    @PostMapping("/adduser")
    public void addUser(@RequestBody User user1){
        user.addUser(user1);
    }
    @PutMapping("/edituser")
    public void editUser(@RequestBody User user1){
        user.EditUser(user1);
    }
}
