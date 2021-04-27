package com.jpaexample.myjpademo.repository;

import com.jpaexample.myjpademo.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

}
