package com.sms.studentmanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sms.studentmanagementsystem.entity.Student;

public interface StudentRepository  extends JpaRepository<Student,Long>{
    
}
