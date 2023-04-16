package com.cydeo.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "paymentDetails")
@NoArgsConstructor
@Getter
@Setter
public class PaymentDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private BigDecimal merchantPaymentAmount;
    private BigDecimal commissionAmount;

    @Column(columnDefinition = "DATE")
    private LocalDate payoutDate;

    @OneToOne(mappedBy = "paymentDetail") // because I don't want this foreign key in my payment table
    private Payment payment;


    public PaymentDetail(BigDecimal merchantPaymentAmount, BigDecimal commissionAmount, LocalDate payoutDate) {
        this.merchantPaymentAmount = merchantPaymentAmount;
        this.commissionAmount = commissionAmount;
        this.payoutDate = payoutDate;
    }
}
