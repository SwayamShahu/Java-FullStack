package com.quizapp.librarymanagement.service;

import com.quizapp.librarymanagement.dto.StudentRequestdto;
import com.quizapp.librarymanagement.model.Student;

import java.text.ParseException;
import java.util.List;

public interface StudentService {
    public Student addStudent(StudentRequestdto student) throws ParseException;
    public Student findStudent(int id);
    public List<Student> findAll();
    public Student UpdateMobile(String mobile , int id);
    public Student findByName(String name);
    public void deleteById(int id);
}
