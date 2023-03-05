package com.cydeo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentController {

    @RequestMapping("/student")  //==> this is end point
    public String getStudentInfo(){
        return "student/welcome.html";  //student is the folder's name under static
                                        //welcome is the html file's name in the student folder
    }
}
