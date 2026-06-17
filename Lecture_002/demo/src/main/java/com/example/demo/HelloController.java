package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
//        Controller are gateway for API Run Point

    @GetMapping("hello")
    public String hello(){
//        return "Hello World";
        return "<h1>Hello World</h1>";
    }

    @GetMapping("bye")
    public String greetBy(){
//        return "Hello World";
        return "<h1>Bye</h1>";
    }


}
