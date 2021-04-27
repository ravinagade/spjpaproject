package com.jpaexample.myjpademo.controller;

import com.jpaexample.myjpademo.model.Customer;
import com.jpaexample.myjpademo.repository.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    @Autowired
    private CustomerRepo customerRepo;

    @PostMapping("/saveCustomer")
    public String saveCustomer(@RequestBody Customer customer){
        customerRepo.save(customer);
        return "Customer added";
    }
}
