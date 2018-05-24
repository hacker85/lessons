package com.max.lessons.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @GetMapping("/helloWorld")
    public String helloWorld() {
        return "hello world";
    }
}