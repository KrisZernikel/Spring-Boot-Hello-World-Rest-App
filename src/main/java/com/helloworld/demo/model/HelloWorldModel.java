package com.helloworld.demo.model;

public class HelloWorldModel {
    
    private String hello;

    public HelloWorldModel(String world) {
        this.hello = world;
    }

    public String getHello() {
        return hello;
    }

    public void setHello(String hello) {
        this.hello = hello;
    }
}