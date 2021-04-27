package com.jpaexample.myjpademo.controller;

import com.jpaexample.myjpademo.model.Department;
import com.jpaexample.myjpademo.repository.DepartmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentRepo departmentRepo;

    @PostMapping("/savedept")
    private String saveDept(@RequestBody Department department){
        departmentRepo.save(department);
        return "Department saved";
    }
}
