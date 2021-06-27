package com.learningSpringboot.StartRestApp.controller;

import com.learningSpringboot.StartRestApp.entity.Department;
import com.learningSpringboot.StartRestApp.service.DepartmentService;
import org.slf4j.ILoggerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    private final Logger LOGGER =
            LoggerFactory.getLogger(DepartmentController.class);

    @PostMapping("department")
    public Department saveDepartment(@Valid @RequestBody Department department){
        LOGGER.info("Inside saveDepartment");
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/department")
    public List<Department> getDepartment(){
        LOGGER.info("Inside getDepartment");
        return  departmentService.getDepartment();
    }

    @GetMapping("/department/{id}")
    public Department getDepartmentById(@PathVariable("id") Long departmentId){
        return departmentService.getDepartmentById(departmentId);
    }

    @PutMapping("/department/{id}")
    public Department putDepartment(@PathVariable("id") Long departmentId,@RequestBody Department department){
        return departmentService.putDepartment(departmentId,department);
    }

    @DeleteMapping("/department/{id}")
    public String deleteDepartment(@PathVariable("id") Long departmentId){
        departmentService.deleteDepartment(departmentId);
        return "Department Deleted Successfull";
    }

    @GetMapping("/department/name/{name}")
    public Department getDepartmentByName(@PathVariable("name") String departmentName){
        return departmentService.getDepartmentByName(departmentName);
    }
}
