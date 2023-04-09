package com.cydeo.entity;

import com.cydeo.enums.Gender;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "employees")
@NoArgsConstructor
@AllArgsConstructor
public class Employee extends BaseEntity{

//    @Id
//    private int id;  base entity already has this field

    private String firstName;
    private String lastName;
    private String email;

    @Column(columnDefinition = "DATE")
    private LocalDate hireDate;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    private int salary;
}
