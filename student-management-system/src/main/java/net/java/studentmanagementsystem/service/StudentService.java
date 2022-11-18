package net.java.studentmanagementsystem.service;

import net.java.studentmanagementsystem.entity.Student;
import org.springframework.stereotype.Service;

import java.util.List;


public interface StudentService {
    public List<Student> getAllStudents();

    void saveStudent(Student student);
    Student getStudentById(Long id);
    Student updateStudent(Student student);
    void deleteStudentById(Long id);
}
