package com.practice.example.Service;

import com.practice.example.Model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

@Service
public class UserService {
    List<User> user= new ArrayList<>(Arrays.asList(
            new User(1, "Gaurav Kumar","Bihar",912245),
            new User(2, "vikash sharma", "Darbhanga",97654321),
            new User(3, "Ram", "nepal",11234567)
    ));
    public List<User> getUser(){
        return user;
    }
    public User getUserById( int id){
        for(User u: user){
            if(u.getId()==id){
                return u;
            }
        }
        throw new NoSuchElementException("Product with id " + id + " not found");
    }
}
