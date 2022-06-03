package com.example.gitpractice.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstController {

    @GetMapping("/Test")
    public String TestController() {
        return "Hello";
    }

    @GetMapping("/develop")
    public String DevelopController() {
        return "develop";
    }
}
