package com.cydeo.entity;

import javax.persistence.*;
import java.math.BigDecimal;
@MappedSuperclass // why not @entity because we do not want to create a table of this super
// class
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String owner;
    private BigDecimal balance;
    private BigDecimal interestRate;
}
