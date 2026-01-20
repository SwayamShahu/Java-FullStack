package com.example.library_management.service.Implementation;

import com.example.library_management.dto.StudentDTO;
import com.example.library_management.enums.Status;
import com.example.library_management.model.Card;
import com.example.library_management.model.Student;
import com.example.library_management.repository.StudentRepository;
import com.example.library_management.service.StudentService;
import jakarta.validation.constraints.Null;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.crypto.Data;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Service

public class StudentServiceImpl implements StudentService {
    @Autowired
    StudentRepository studentRepository;

    @Override
    public String addStudent(StudentDTO studentData) throws ParseException {
        Student student = new Student();
        student.setAge(studentData.getAge());
        student.setName(studentData.getName());
        student.setDepartment(studentData.getDepartment());
        student.setMobNo(studentData.getMobNo());
        Card card = new Card();
        card.setCardStatus(Status.ACTIVATED);
        SimpleDateFormat format = new SimpleDateFormat("YY-MM-DD");
        Date date = format.parse(LocalDate.now().plusYears(4).toString());
        card.setStudent(student);
        student.setCard(card);
        studentRepository.save(student);

        return "Student added Successfully";
    }


    @Override
    public Student findStudent(int id) {

        return studentRepository.findById(id).orElse(null);
    }

    @Override
    public List<Student> findAll() {
       return studentRepository.findAll();
    }

    @Override
    public Student updateMobile(String mobile, int id) {
        Student student=studentRepository.findById(id).get();
        student.setMobNo(mobile);
        studentRepository.save(student);
        return student;
    }



    @Override
    public String deletebyId(int id){
        studentRepository.deleteById(id);
        return "Student deleted";
    }
}
