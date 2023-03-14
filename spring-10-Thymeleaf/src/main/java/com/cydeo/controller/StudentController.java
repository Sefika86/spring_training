package com.cydeo.controller;

import com.cydeo.bootstrap.DataGenerator;
import lombok.Getter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/student") //this end point belongs to all methods in this class
public class StudentController {

   // @RequestMapping(value = "/register",method = RequestMethod.GET) //localhost:8080/student/register
    @GetMapping("/register")  //localhost:8080/student/register
    public String register(Model model){
        model.addAttribute("students", DataGenerator.createStudent());
        return "student/register";
    }


/*
    @RequestMapping("/welcome")  //localhost:8080/student/welcome?name=Ozzy
    public String welcome(@RequestParam String name){
        System.out.println(name);
        return "student/welcome";
    }

 */


    @RequestMapping(value = "/welcome",method = RequestMethod.POST)
    @PostMapping("/welcome")
    public String welcome1(@RequestParam int id){  //localhost:8080/student/welcome?id=3
        //System.out.println(id);
        return "student/welcome";
    }
}
