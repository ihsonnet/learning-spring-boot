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
        return new Coder(1001,"Rahmat Ali","Python",computer);
    }

    @Bean
    public Computer computer1(){
        return new Computer("HP");
    }

    @Bean
    public Coder coder2(@Qualifier("computer2") Computer computer) {

        return new Coder(1002,"Mahmud Ali Khan", "Java",computer);
    }

    @Bean
    public Computer computer2(){

        return new Computer("Dell");
    }
}
