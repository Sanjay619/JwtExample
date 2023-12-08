package com.jwt.example.controllers;

import com.jwt.example.models.User;
import com.jwt.example.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/home")
public class HomeController {

    @Autowired
    UserServices userServices;
    //http://localhost:8081/home/user
    @GetMapping("/users")
    public List<User> getUser(){
        System.out.println("getting user");
        return this.userServices.getStore();

    }

    @GetMapping("/test")
    public String getTest(){
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String password = "123456";
        String encodedPassword = passwordEncoder.encode(password);

        System.out.println();
        System.out.println("Password is         : " + password);
        System.out.println("Encoded Password is : " + encodedPassword);
        System.out.println();

        return encodedPassword;
    }
}
