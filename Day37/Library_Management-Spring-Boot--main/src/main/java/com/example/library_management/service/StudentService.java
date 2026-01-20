package com.example.library_management.service;

import com.example.library_management.dto.StudentDTO;
import com.example.library_management.model.Student;

import java.text.ParseException;
import java.util.List;

public interface StudentService {

    public String addStudent(StudentDTO studentDTO) throws ParseException;
    Student findStudent(int id);
    List<Student> findAll();
    Student updateMobile(String mobile, int id);
    public String deletebyId(int id);
}
