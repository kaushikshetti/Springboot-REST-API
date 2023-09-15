package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    private final UserRepository userRepository;
    @Autowired

    public UserController(UserRepository userRepository)
    {
        this.userRepository=userRepository;

    }
    @GetMapping("/user")
    public List<User> getUsers(){
        return userRepository.findAll();
    }
}
