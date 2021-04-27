package com.jpaexample.myjpademo.controller;

import com.jpaexample.myjpademo.model.PurchaseOrder;
import com.jpaexample.myjpademo.repository.PurchaseOrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class PurchaseOrderController {

    @Autowired
    private PurchaseOrderRepo purchaseOrderRepo;

    @PostMapping("/savePo")
    public String savePo(@RequestBody PurchaseOrder purchaseOrder){
        purchaseOrderRepo.save(purchaseOrder);
        return "PO saved";
    }

    @DeleteMapping("/removepo/{id}")
    public String removeData(@PathVariable Integer id){
        purchaseOrderRepo.deleteById(id);
        return "PO deleted";
    }
}
