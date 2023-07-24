package com.example.studentapinodb.rest.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("animal")
public class AnimalsController {


    @GetMapping
    public String getAnimal() {
        return "Getting penguing";
    }

    @GetMapping("/{id}")
    public String getAnimal(@PathVariable Long id) {
        return "Penguing " + id;
    }
}
