package com.learningspringboot.starterproject.config;

import com.learningspringboot.starterproject.model.Coder;
import com.learningspringboot.starterproject.model.Computer;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {
    @Bean
    public Coder coder1(@Qualifier("computer1") Computer computer) {
        Coder c1 = new Coder();
        c1.setId(1001);
        c1.setName("Mijan Ali");
        c1.setLanguage("Java");
        c1.setComputer(computer);

        return c1;
    }

    @Bean
    public Computer computer1(){
        Computer com1 = new Computer();
        com1.setBrand("HP");

        return com1;
    }

    @Bean
    public Coder coder2(@Qualifier("computer2") Computer computer) {
        Coder c2 = new Coder();
        c2.setId(1002);
        c2.setName("Ram lal Ali");
        c2.setLanguage("Python");
        c2.setComputer(computer);

        return c2;
    }

    @Bean
    public Computer computer2(){
        Computer com2 = new Computer();
        com2.setBrand("Dell");

        return com2;
    }
}
