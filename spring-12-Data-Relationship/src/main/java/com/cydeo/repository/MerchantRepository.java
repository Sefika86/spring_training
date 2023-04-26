package com.cydeo.repository;

import com.cydeo.entity.Merchant;
import com.cydeo.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MerchantRepository extends JpaRepository<Merchant, Long> {
}
