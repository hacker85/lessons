package com.max.lessons.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
    @GetMapping("/helloWorld")
    @ResponseBody
    public String helloWorld() {
        return "hello world";
    }
    @GetMapping("/index")
    public String index() {
        return "index";
    }
}