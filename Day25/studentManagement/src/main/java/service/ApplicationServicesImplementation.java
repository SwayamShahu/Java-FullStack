package service;

import model.Student;
import repository.StudentRepositoryImplementation;

import java.util.ArrayList;
import java.util.List;

public class ApplicationServicesImplementation implements ApplicationServices {
    StudentRepositoryImplementation srt = new StudentRepositoryImplementation();

    @Override
    public void addStudent(Student student) {
        srt.save(student);
    }

    @Override
    public Student getStudentByID(int studentID) {
        return srt.findById(studentID);
    }

    @Override
    public List<Student> getAllStudents() {
        return srt.findAll();
    }

    @Override
    public List<Student> searchStudentByName(String name) {
        List<Student> searchStudent = new ArrayList<>();

        for (Student student: srt.findAll()){
            if (student.getName().toLowerCase() == name.toLowerCase()){
                searchStudent.add(student);
            }
        }
        return searchStudent;
    }
}
