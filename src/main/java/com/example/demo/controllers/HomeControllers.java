package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeControllers {

    @GetMapping("/")
    public String home() {
        return "index.html"; // Spring Boot zoekt dit in /static of /public
    }
}
