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

    @Bean
    public Case caseDell(Dimensions dimensions){
        return new DellCase("220B", "Dell", "240", dimensions);
    }                                                                       //wiring is done automatically


    //here we used wiring beans method by using method parameters
    //the other wiring beans technique is by  calling the method

}
