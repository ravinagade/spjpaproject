package com.jpaexample.myjpademo.repository;

import com.jpaexample.myjpademo.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepo extends JpaRepository<Customer,Integer> {
}
