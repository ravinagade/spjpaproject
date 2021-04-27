package com.jpaexample.myjpademo.repository;

import com.jpaexample.myjpademo.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepo extends JpaRepository<Department,Integer> {
}
