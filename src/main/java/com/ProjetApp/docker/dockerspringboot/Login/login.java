package com.ProjetApp.docker.dockerspringboot.Login;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")

public class login {
    @GetMapping
    public String Login(){
        return "Page login";
    }
}
