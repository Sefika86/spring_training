package com.cydeo.repository;

import com.cydeo.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//@Repository  //we do not need this annotation with the new version of SpringBoot
public interface CarRepository extends JpaRepository<Car, Long> {
    // we can also create our own custom abstract methods here but where we implement those?
    //we will learn it in 5.Queries topic
}
