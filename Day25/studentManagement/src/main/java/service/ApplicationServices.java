package service;
import model.Student;
import java.util.List;

public interface ApplicationServices {
    void addStudent(Student student);
    Student getStudentByID(int studentID);
    List<Student> getAllStudents();
    List<Student> searchStudentByName(String name);
}
