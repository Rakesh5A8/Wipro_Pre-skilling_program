package com.company.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.company.entity.UserEntity;
import com.company.repository.UserRepository;


import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/user")
public class UserController {

    private final UserRepository repo;
 

    @PostMapping("/register")
    public String register(@RequestBody UserEntity user) {
        repo.save(user);
        return "User Registered Successfully!";
    }
    
    @PostMapping("/login")
    
}