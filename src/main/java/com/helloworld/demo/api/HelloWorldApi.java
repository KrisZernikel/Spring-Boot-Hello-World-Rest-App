package com.helloworld.demo.api;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import com.helloworld.demo.model.HelloWorldModel;

@RestController
public class HelloWorldApi {
    
    @GetMapping(value = "/hello-world", produces = "application/json")
    public HelloWorldModel getMethod() {
        return new HelloWorldModel("world");
    }
}