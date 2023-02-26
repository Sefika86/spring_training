package com.cydeo.config;

import com.cydeo.casefactory.Case;
import com.cydeo.casefactory.DellCase;
import com.cydeo.casefactory.Dimensions;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PcConfig {

    @Bean
    public Dimensions dimensions(){
        return new Dimensions(50,10,10);
    }
    //loosely coupled



    //WE CAN DO WIRING IN 2 WAYS
    //1-BY PARAMETERS
    //2-BY CALLING THE METHOD NAME
    @Bean
    public Case caseDell(Dimensions dimensions){
        return new DellCase("220B", "Dell", "240", dimensions);
    }                                                                       //wiring is done by using parameters


    @Bean
    public Case caseDell(){
        return new DellCase("220B", "Dell", "240", dimensions() );
    }                                                                       //wiring is done by calling the method


}
