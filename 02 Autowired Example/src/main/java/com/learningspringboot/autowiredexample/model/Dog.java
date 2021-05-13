package com.learningspringboot.autowiredexample.model;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PreDestroy;

@Configuration
public class Dog {

    public Dog() {
        System.out.println("Dog object Created");
    }

    public void info(){
        System.out.println("This is a bangladeshi dog.");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Dog object destroyed");
    }
}
