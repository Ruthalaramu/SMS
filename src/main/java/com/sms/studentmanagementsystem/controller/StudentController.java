package com.sms.studentmanagementsystem.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sms.studentmanagementsystem.service.StudentService;

@RestController
@RequestMapping("/sms")
public class StudentController {

    private StudentService studentService;
    
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/students")
    public String  getAllStudentds(Model model){

       model.addAttribute("students",studentService.getAllStudents());
    return "students";
        
    }
    
}
