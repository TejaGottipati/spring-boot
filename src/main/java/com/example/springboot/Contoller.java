package com.example.springboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Contoller {
    @RequestMapping("/")
    public String helloWorld(){
        return "Hello World from Spring Boot";
    }
    @RequestMapping("/goodbye")
    public String goodbye(){
        return "GoodBye from Spring Boot";
    }
}
