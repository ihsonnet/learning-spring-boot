package com.learningspringboot.starterproject;
import com.learningspringboot.starterproject.model.Coder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource({"classpath:BeanConfig.xml"})
public class StarterProjectApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(StarterProjectApplication.class, args);
        Coder c1 = (Coder) context.getBean("coder1");

        System.out.println(c1.getName());
        System.out.println("Computer:"+ c1.getComputer().getBrand());
    }

}
