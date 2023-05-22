package com.itech.app.learn.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class HomeController {
    @GetMapping("/")
    @ResponseBody
    private String home(){
        return "Welcome to my application instance";
    }
}
