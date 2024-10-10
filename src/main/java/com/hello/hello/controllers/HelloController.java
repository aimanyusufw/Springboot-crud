package com.hello.hello.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class HelloController {

    @GetMapping("/api/hello")
    public String getMethodName() {
        return new String("Hello");
    }

}
