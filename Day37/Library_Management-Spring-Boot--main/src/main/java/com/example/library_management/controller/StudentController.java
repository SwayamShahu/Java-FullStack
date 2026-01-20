package com.example.library_management.controller;

import com.example.library_management.dto.StudentDTO;
import com.example.library_management.model.Student;
import com.example.library_management.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.util.List;

@RestController
@RequestMapping("api/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping("/addStudent")
    public String addStudent(@RequestBody StudentDTO studentDTO) throws ParseException {
        return studentService.addStudent(studentDTO);


    }

    @GetMapping("/find/{id}")
    public Student findStudent(@PathVariable int id) {
        return studentService.findStudent(id);
    }

    @GetMapping("/findAll")
    public List<Student> findAll() {
        return studentService.findAll();

    }
    @PutMapping("/updateMobile/{id}")
        public Student updateMobile ( @PathVariable int id, @RequestBody String mobile){
            return studentService.updateMobile(mobile, id);
        }
    @GetMapping("/deletebyId/{id}")
    public String delete(@PathVariable int id){
        return studentService.deletebyId(id);
    }


}
