package com.jpaexample.myjpademo.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String city;

    @ManyToOne
    @JoinColumn(name = "dept_id")
    private Department department;


}
