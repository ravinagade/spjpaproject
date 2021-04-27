package com.jpaexample.myjpademo.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
public class PurchaseOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String customerName;
    private String city;
    private Double amount;

    @JsonManagedReference
    @OneToMany(mappedBy = "purchaseOrder",cascade = CascadeType.ALL)
    private Set<PoItems> poItemsSet;


}
