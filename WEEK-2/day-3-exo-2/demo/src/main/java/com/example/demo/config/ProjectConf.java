package com.example.demo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = {"com.example.demo.services", "com.example.demo.aspects"})
@EnableAspectJAutoProxy
public class ProjectConf {}
