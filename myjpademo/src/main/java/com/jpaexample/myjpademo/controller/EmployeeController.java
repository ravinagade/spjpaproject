package com.jpaexample.myjpademo.controller;

import com.jpaexample.myjpademo.model.Employee;
import com.jpaexample.myjpademo.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeRepo employeeRepo;

    @PostMapping("/saveEmp")
    public String saveEmployee(@RequestBody Employee employee){
        employeeRepo.save(employee);
        return "Employee saved";
    }

    @GetMapping("/getEmp/{id}")
    public List<Employee> getAllEmployees(){
       return employeeRepo.findAll();
   }

}
