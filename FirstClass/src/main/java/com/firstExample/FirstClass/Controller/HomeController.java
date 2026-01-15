package com.firstExample.FirstClass.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
    @RequestMapping("/")
    @ResponseBody
    public String greet(){
        System.out.println("i am here");
        return "welcome to the world of Gaurav";
    }
}
