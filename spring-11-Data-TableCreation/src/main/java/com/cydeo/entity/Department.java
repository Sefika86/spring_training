package com.cydeo.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table (name = "departments")
@NoArgsConstructor
@AllArgsConstructor
public class Department extends BaseEntity{

//    @Id
//    @GeneratedValue (strategy = GenerationType.IDENTITY)
//    private Long id;    **baseEntity class already has this field , no need here


    private String department;
    private String division;
}
