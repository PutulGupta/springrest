package com.springrest.springrest.controller;

import com.springrest.springrest.models.Student;
import com.springrest.springrest.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/springrest")
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping("/hello")
    public String sayHello(){
        return "Welcome to RestApi";
    }

    //http://localhost:8080/student-by-id/10
    @GetMapping("/student-by-id/{id}")
    public Student getStudentById(@PathVariable("id") int id){
        return studentService.getById(id);
    }
    //http://localhost:8080/student-by-name/Amit
    @GetMapping("/student-by-name/{name}")
    public List<Student> getStudentByName(@PathVariable("name") String name){
        return studentService.getStudentByName(name);
    }
// http://localhost:8080/student-by-course/?category=Fiction
    @GetMapping("/student-by-course")
    public List<Student> getStudentByCourse(@PathVariable("course") String course){
        return studentService.getStudentByCourse(course);
    }

}
