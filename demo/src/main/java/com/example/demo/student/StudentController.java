package com.example.demo.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping(path = "api/v2/student")
public class StudentController {
    @GetMapping()
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
