package com.example.microservices.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Approved {

@PatchMapping("allIsWell")
    public String getResult(String s){
        return "result";
    }

}
