package com.example.demo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentServices {
    public List<Student> getStudentInfo(){
        return List.of(
                new Student(
                        1L,
                        "Injamamul Haque Sonet",
                        "ihsonnet@gmail.com",
                        LocalDate.of(1999,05,31),
                        21
                )
        );
    }
}
