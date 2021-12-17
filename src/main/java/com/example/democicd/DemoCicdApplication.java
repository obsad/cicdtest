package com.example.democicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController("/test")
public class DemoCicdApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoCicdApplication.class, args);
    }

    @GetMapping
    public  String hello(){
        return "Hello from Docker";
    }

}
