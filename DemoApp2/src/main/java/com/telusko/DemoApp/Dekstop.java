package com.telusko.DemoApp;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class Dekstop implements Computer {
    public void compile(){
        System.out.println("Compiling with 404 bugs and faster");
    }
}
