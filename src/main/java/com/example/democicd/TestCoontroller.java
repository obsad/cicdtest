package com.example.democicd;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestCoontroller {

    @GetMapping
    public  String hello(){
        System.out.println("change ");
        return "Hello from Docker";

    }
}
