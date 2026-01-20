package com.quizapp.librarymanagement.service.Implementation;

import com.quizapp.librarymanagement.Enums.Status;
import com.quizapp.librarymanagement.dto.StudentRequestdto;
import com.quizapp.librarymanagement.model.Card;
import com.quizapp.librarymanagement.model.Student;
import com.quizapp.librarymanagement.repository.StudentRepository;
import com.quizapp.librarymanagement.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student addStudent(StudentRequestdto studentData) throws ParseException {
        Student student = new Student();
        student.setAge(studentData.getAge());
        student.setName(studentData.getName());
        student.setDepartment(studentData.getDepartment());
        student.setMobNo(studentData.getMobNo());

        Card card = new Card();
        card.setCardStatus(Status.ACTIVATED);
        SimpleDateFormat format = new SimpleDateFormat("YYYY-MM-DD");
        Date date = format.parse(LocalDate.now().plusYears(4).toString());
        card.setExpiryDate(date);
        card.setStudent(student);
        student.setCard(card);

        return studentRepository.save(student);
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
    public Student UpdateMobile(String mobile, int id) {
        Student student = studentRepository.findById(id).get();
        student.setMobNo(mobile);
        studentRepository.save(student);
        return student;
    }
    public Student findByName(String name){

        return null;
    }

    @Override
    public void deleteById(int id) {
        studentRepository.deleteById(id);
    }
}
