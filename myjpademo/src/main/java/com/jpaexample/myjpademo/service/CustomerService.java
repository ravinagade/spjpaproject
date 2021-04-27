package com.jpaexample.myjpademo.service;

import com.jpaexample.myjpademo.model.Customer;
import com.jpaexample.myjpademo.repository.CustomerRepo;
import org.hibernate.PersistentObjectException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class CustomerService {

    @Autowired
    private CustomerRepo customerRepo;

    public void addCustomer(Customer customer){
        try {
            customerRepo.save(customer);
        }catch (Exception e){
            throw new PersistentObjectException("RollBack transaction...");
        }
    }
}
