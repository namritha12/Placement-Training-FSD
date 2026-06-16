package com.ex.demodemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class First {
    @GetMapping("/hello")
    public String sayhello() {
        return "hello";
    }

    @GetMapping("/name")
    public String sayName(){
        return "I am Namri dont disturb me";
    }
    @GetMapping("/age")
    public int sayAge(){
        return 20;
    }
    @GetMapping("/color")
    public String sayColor(){
        return "Blue";
    }
}
