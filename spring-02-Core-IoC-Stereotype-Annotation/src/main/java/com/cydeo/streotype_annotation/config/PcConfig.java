package com.cydeo.streotype_annotation.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.cydeo.streotype_annotation")
public class PcConfig {

}

//WE use @ComponentScan annotation to let Spring go to scan all classes which we annotate with @Component
//Or ("com.cydeo.streotype_annotation") when we type package name beside the @ComponentScan , it lets Spring scanning whole package for the beans