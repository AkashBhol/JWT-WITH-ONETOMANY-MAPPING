package com.example.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class WelcomeController {

//http://localhost:8089/api/get
    @GetMapping("/get")
    public String welcome() {
        return "Welcome to home !!";
    }


}
