package com.springrest.springrest.service;

import com.springrest.springrest.models.Student;

import java.util.List;

public interface StudentService {

    Student getById(int studentId);
    List<Student> getStudentByName(String name);
    List<Student> getStudentByCourse(String course);

}
