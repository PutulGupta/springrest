package com.springrest.springrest.service;

import com.springrest.springrest.models.Student;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StudentServiceImpl implements StudentService {
    @Override
    public Student getById(int studentId) {
        return getStudentList().stream().filter((student)->student.getStudentid()==studentId)
                .findAny().orElse(new Student());
    }



    @Override
    public List<Student> getStudentByName(String name) {
        return getStudentList().stream().filter((student)->student.getName().equals(name))
                .collect((Collectors.toList()));
    }

    @Override
    public List<Student> getStudentByCourse(String course) {
        return getStudentList().stream().filter((student)->student.getCourse().equals(course))
                .collect((Collectors.toList()));
    }

    private List<Student> getStudentList() {
        return Arrays.asList(new Student("Gaurav",101, 1234567890, "Java"),
                (new Student("Shiv",102, 1233217890, "React"),
                (new Student("Amit",103, 1234567990, "Mern"),
                (new Student("Ashish",104, 1324567890, "Python"),
                (new Student("Putul",105, 1234567790, "Java"));
    }
}
