package com.learningspringboot.starterproject;
import com.learningspringboot.starterproject.config.BeanConfig;
import com.learningspringboot.starterproject.model.Coder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import({BeanConfig.class})
public class StarterProjectApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(StarterProjectApplication.class, args);
        Coder c1 = (Coder) context.getBean("coder1");

        System.out.println(c1.getName());
        System.out.println("Computer:"+ c1.getComputer().getBrand());

        Coder c2 = (Coder) context.getBean("coder2");

        System.out.println(c2.getName());
        System.out.println("Computer:"+ c2.getComputer().getBrand());
    }

}
