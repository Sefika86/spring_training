package com.cydeo.bean_annotation.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//We can create multiple configuration classes, for example lets Create another configuration
//class which let Spring manage one Spring and one Integer:

@Configuration
public class RandomConfig {

    @Bean
    public String myString(){
        return "Cydeo";
    }

    @Bean
    public Integer myInteger(){
        return 5;
    }
}
