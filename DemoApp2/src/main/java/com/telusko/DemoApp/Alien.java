package com.telusko.DemoApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Alien {
    @Autowired
    private Computer comp;
//    @Autowired //Field Injection
//    private Laptop laptop;
//    public Alien(Laptop laptop){
//        this.laptop= laptop;
//    }
//    @Autowired
//    public void setLaptop(Laptop laptop){
//        this.laptop= laptop;
//    }

    public void build(){
//        laptop.compile();
        comp.compile();
        System.out.println("working on Awesome Project");
    }
}
