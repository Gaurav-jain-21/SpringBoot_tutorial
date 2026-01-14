package com.telusko.DemoApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoAppApplication {

	public static void main(String[] args) {

		ApplicationContext context=SpringApplication.run(DemoAppApplication.class, args);
		Alien obj= context.getBean(Alien.class);
		obj.build();
	}

}
