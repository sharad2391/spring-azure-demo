package com.example.springazuredemo;

import com.example.springazuredemo.dao.StudentDao;
import com.example.springazuredemo.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController {
    @Autowired
    private StudentDao studentDao;

    @GetMapping("/hello")
    public String hello() {
        return "Hello from spring boot app";
    }

    @GetMapping("/student")
    public List<Student> getStudentDetails() {
        return studentDao.getAllStudent();

    }

}

