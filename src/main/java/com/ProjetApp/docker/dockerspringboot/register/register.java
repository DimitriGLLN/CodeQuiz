package com.ProjetApp.docker.dockerspringboot.register;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/register")

public class register {
    @GetMapping
    public String register(){
        return "Page register";
    }
}