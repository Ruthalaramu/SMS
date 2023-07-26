package com.sms.studentmanagementsystem.serviceImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sms.studentmanagementsystem.entity.Student;
import com.sms.studentmanagementsystem.repository.StudentRepository;
import com.sms.studentmanagementsystem.service.StudentService;

@Service
public class  StudentServiceImpl implements  StudentService{
    private StudentRepository studentRepository;
    

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }


    @Override
    public List<Student> getAllStudents() {
        studentRepository.findAll();
        throw new UnsupportedOperationException("Unimplemented method 'getAllStudents'");
    }
    
}
