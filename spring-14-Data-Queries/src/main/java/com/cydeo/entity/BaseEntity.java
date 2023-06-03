package com.cydeo.entity;


import javax.persistence.MappedSuperclass;
import javax.persistence.Id;


@MappedSuperclass
public class BaseEntity {

    @Id
    private Integer id;
}

