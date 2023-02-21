package com.cydeo.bean_annotation;

import com.cydeo.bean_annotation.casefactory.Case;
import com.cydeo.bean_annotation.config.ComputerConfig;
import com.cydeo.bean_annotation.config.RandomConfig;
import com.cydeo.bean_annotation.monitorfactory.Monitor;
import com.cydeo.bean_annotation.monitorfactory.SonyMonitor;
import com.cydeo.bean_annotation.motherboardfactory.Motherboard;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.ui.context.Theme;

public class ComputerTest {

    public static void main(String[] args) {



        System.out.println("Creating Container"); //Creating container by using Application Context Interface
        ApplicationContext container = new AnnotationConfigApplicationContext(ComputerConfig.class, RandomConfig.class);


      // Monitor theMonitor =  container.getBean(Monitor.class); //but if we have more than one method that return different type of monitors, this will give me exception
        SonyMonitor theMonitor = container.getBean(SonyMonitor.class);

        Case theCase = container.getBean(Case.class);

        Motherboard theMotherboard = container.getBean(Motherboard.class);

        PC myPc = new PC(theCase, theMonitor, theMotherboard);

        myPc.powerUp();




    }
}
