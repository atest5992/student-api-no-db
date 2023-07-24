package com.example.studentapinodb.rest.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("greeting")
public class GreetingsController {

    @GetMapping
    public String sayHi() {
        return "Hi";
    }
}