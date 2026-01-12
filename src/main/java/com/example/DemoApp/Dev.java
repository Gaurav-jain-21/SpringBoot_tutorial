package com.example.DemoApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Dev {
    @Autowired
    private Laptop laptop;
//    public Dev(Laptop laptop){
//        this.laptop=laptop;
//    }
    public void build(){
        System.out.println("working on Awesome Projects");
        laptop.compile();
    }
}
