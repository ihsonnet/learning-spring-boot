package com.learningspringboot.autowiredexample;

import com.learningspringboot.autowiredexample.model.Coder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class AutowiredExampleApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(AutowiredExampleApplication.class, args);

        Coder c1 = context.getBean(Coder.class);

        c1.petInfo();
    }

}
