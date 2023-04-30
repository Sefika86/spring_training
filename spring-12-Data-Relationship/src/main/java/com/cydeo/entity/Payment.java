package com.cydeo.entity;

import com.cydeo.enums.Status;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "payments")
@NoArgsConstructor
@Data
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "DATE")
    private LocalDate createdDate;

    private BigDecimal amount;

    @Enumerated(EnumType.STRING)
    private Status paymentStatus;


    //** We make a "has a relationship" with PaymentDetails class to be able to join 2 tables
    //it gives compile error because SpringBoot works with 4 diff relationships:
    //One-to-One
    //One-to-Many
    //Many-to-One
    //Many-to-many

   // @OneToOne (cascade = CascadeType.ALL)  //this helps to do the same action in parent and child
    @OneToOne(cascade = {CascadeType.PERSIST,CascadeType.MERGE})
    @JoinColumn(name = "payment_details_id")
    private PaymentDetail paymentDetail;

    @ManyToOne
    private Merchant merchant;

    @ManyToOne
    private Customer customer;


    //we do not use@AllArgCons because we want id to be assigned by Postgres
    public Payment(LocalDate createdDate, BigDecimal amount, Status paymentStatus) {
        this.createdDate = createdDate;
        this.amount = amount;
        this.paymentStatus = paymentStatus;
    }
}
