package com.example.demo.main;

import com.example.demo.config.ProjectConf;
import com.example.demo.services.HelloService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {
    public static void main(String[] args) {
        try (var c = new AnnotationConfigApplicationContext(ProjectConf.class)) {
            HelloService helloService = c.getBean(HelloService.class);
            helloService.hello("John");
        }
    }
}
