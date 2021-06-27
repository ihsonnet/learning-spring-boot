package com.learningSpringboot.StartRestApp.service;

import com.learningSpringboot.StartRestApp.entity.Department;

import java.util.List;

public interface DepartmentService {
    Department saveDepartment(Department department);

    List<Department> getDepartment();

    Department getDepartmentById(Long departmentId);

    void deleteDepartment(Long departmentId);

    Department putDepartment(Long departmentId, Department department);

    Department getDepartmentByName(String departmentName);
}
