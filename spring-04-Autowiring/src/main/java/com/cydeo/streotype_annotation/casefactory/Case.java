package com.cydeo.streotype_annotation.casefactory;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

@Getter
@Setter
public abstract class Case {

    private String model;
    private String manufacturer;
    private String powerSupply;

    @Autowired
    private Dimensions dimensions;  //I am not adding in constructor this time
                                    //we will learn autowired technique in the fields

    public Case(String model, String manufacturer, String powerSupply) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.powerSupply = powerSupply;
    }

    public abstract void pressPowerButton();
}
