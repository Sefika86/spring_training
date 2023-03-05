package com.cydeo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentController {

    @RequestMapping("/welcome")
    public String homePage(Model model){
       // String name = "ABC";  //How to add this in our html page? with a Template Engine

        model.addAttribute("name", "Cydeo");
        model.addAttribute("course", "MVC");

        return "student/welcome"; //in the templates directory
    }
}
