package com.springRest.springRest.controller;

import com.springRest.springRest.Services.CourseService;
import com.springRest.springRest.entity.Course;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class myController {

    private final CourseService courseService;

    public myController(CourseService courseService) {
        this.courseService = courseService;
    }

    @GetMapping("/courses")
    public List<Course> getCourses(){
        return this.courseService.getCourses();
    }

    @GetMapping("/courses/{courseId}")
    public Course getCourse(@PathVariable int courseId){
        return this.courseService.getCourse(courseId);
    }

    @PostMapping("/courses")
    public Course addCourse(@RequestBody Course course){
        return this.courseService.addCourse(course);
    }
}

