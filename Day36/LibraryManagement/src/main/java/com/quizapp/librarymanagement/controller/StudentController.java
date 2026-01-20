package com.quizapp.librarymanagement.controller;

import com.quizapp.librarymanagement.dto.StudentRequestdto;
import com.quizapp.librarymanagement.model.Student;
import com.quizapp.librarymanagement.service.Implementation.StudentServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {
    private StudentServiceImpl service;

    public StudentController(StudentServiceImpl service) {
        this.service = service;
    }
    @PostMapping("/student")
    public ResponseEntity<Student> addStudent(@RequestBody StudentRequestdto studentDto) throws ParseException {
        Student savedStudent = service.addStudent(studentDto);
        return ResponseEntity.ok(savedStudent);
    }
    @GetMapping
    public ResponseEntity<List<Student>> getAll(){
        return new ResponseEntity<>(service.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Student> findStudent(@PathVariable int id){
        return ResponseEntity.ok(service.findStudent(id));
    }
    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteById(@PathVariable int id) {
        try {
            service.deleteById(id);   // void method
            return ResponseEntity.ok("Record deleted successfully");
        } catch (Exception e) {
            return ResponseEntity
                    .status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Failed to delete record with id: " + id);
        }
    }



}
