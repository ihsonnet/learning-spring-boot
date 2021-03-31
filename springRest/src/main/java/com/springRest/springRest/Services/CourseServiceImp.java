package com.springRest.springRest.Services;

import com.springRest.springRest.entity.Course;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseServiceImp implements CourseService {

    List<Course> courseList;

    public CourseServiceImp(){
        courseList = new ArrayList<>();
        courseList.add(
                new Course(123,"Course1","This is the description of course 1")
                );
        courseList.add(
                new Course(234,"Course2","This is the description of course 2")
        );
    }

    @Override
    public List<Course> getCourses() {
        return courseList;
    }

    @Override
    public Course getCourse(int courseId) {
        Course c=null;
        for (Course course: courseList){
            if (course.getId()==courseId)
            {
               c=course;
               break;
            }
        }
        return c;
    }

    @Override
    public Course addCourse(Course course) {
        courseList.add(course);
        return course;
    }
}
