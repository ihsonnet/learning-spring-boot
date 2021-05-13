package com.learningspringboot.starterproject.model;

import javax.annotation.PreDestroy;

public class Computer {
    private String brand;

    public Computer() {
        System.out.println("No Arg Constructor Called (Computer Class)");
    }

    public Computer(String brand) {
        this.brand = brand;
        System.out.println("All Arg Constructor Called (Computer Class)");
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @PreDestroy
    public void objectDestroyed() {
        System.out.println("Computer Object Destroyed");
    }
}
