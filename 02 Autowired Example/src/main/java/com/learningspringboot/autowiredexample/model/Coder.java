package com.learningspringboot.autowiredexample.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PreDestroy;

@Configuration
public class Coder {

    @Autowired
    Dog dog;

    public Coder() {
        System.out.println("Coder object Created");
    }

//    final
//    Dog dog;
//
//    public Coder(Dog dog) {
//        System.out.println("Coder object Created");
//        this.dog = dog;
//    }

    public void petInfo(){
        dog.info();
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Coder object destroyed");
    }
}
