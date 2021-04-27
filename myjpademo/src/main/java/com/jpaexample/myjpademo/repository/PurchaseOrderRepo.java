package com.jpaexample.myjpademo.repository;

import com.jpaexample.myjpademo.model.PurchaseOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PurchaseOrderRepo extends JpaRepository<PurchaseOrder,Integer> {
}
