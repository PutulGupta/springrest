package com.springrest.springrest.service;

import com.springrest.springrest.models.Student;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface StudentService {

    Student getById(int studentId);
    List<Student> getStudentByName(String name);
    List<Student> getStudentByCourse(String course);

}
