package com.example.demo.student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args -> {
            Student injamam = new Student(
                    "Injamam",
                    "ihsonnet@gmail.com",
                    LocalDate.of(1999,05,31)
            );
            Student sonet = new Student(
                    "Sonet",
                    "sonat1001@gmail.com",
                    LocalDate.of(2004,05,31)
            );
            studentRepository.saveAll(
                    List.of(injamam,sonet)
            );
        };
    }
}
