package com.example.controller.db;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;

@Component
public class DatabaseConnection {

    private List<String> users;

    @PostConstruct
    public void init() {
        users = new ArrayList<>();
        System.out.println("DB connection (simulated)");
    }

    public List<String> getUsers() {
        return users;
    }

    public void addUser(String user) {
        users.add(user);
    }

    @PreDestroy
    public void cleanup() {
        System.out.println("DB disconnected");
    }
}
