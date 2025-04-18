package com.sreedhar.firstspringbootapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class Welcome {
    @GetMapping("greet")
    public String message(){
        System.out.println("++++++++++++++");


        return "Hello, Naveen how are u.";
    }
}
