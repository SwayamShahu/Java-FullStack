package repository;

import model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentRepositoryImplementation implements  StudentRepository{

    static List<Student> students = new ArrayList<>();

    @Override
    public void save(Student student) {
        students.add(student);
    }

    @Override
    public Student findById(int studentID) {
        for(Student student: students){
            if(student.studentID == studentID){
                return student;
            }
        }
        return null;
    }

    @Override
    public List<Student> findAll() {
        return students;
    }

    @Override
    public boolean deleteById(int studentId) {
        for (int i = 0; i < students.size(); i++) {
            if (studentId == students.get(i).studentID){
                students.remove(i);
                return true;
            }
        }
        return false;
    }
}
