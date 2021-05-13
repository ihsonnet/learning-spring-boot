package com.learningspringboot.autowiredexample.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import javax.annotation.PreDestroy;

@Configuration
@Scope(value = "prototype")  //singleton or prototype
public class Coder {

    public String name;

    @Autowired
    Dog dog;

    public Coder() {
        System.out.println("Coder object Created");
    }

    public void petInfo(){
        dog.info();
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Coder object destroyed");
    }
}
