package com.springRest.springRest.Services;

import com.springRest.springRest.entity.Course;

import java.util.List;

public interface CourseService {

    public List<Course> getCourses();

    Course getCourse(int courseId);

    Course addCourse(Course course);
}
