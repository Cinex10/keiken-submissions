package com.example.demo.services;

import org.springframework.stereotype.Service;

@Service
public class HelloService {
    @TimeIt
    public void hello(String name) {
        String result = "Hello, " + name + "!";
        System.out.println(result);
        try {
            Thread.sleep(1200);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
