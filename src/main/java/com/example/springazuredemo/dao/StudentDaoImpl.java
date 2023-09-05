package com.example.springazuredemo.dao;

import com.example.springazuredemo.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Repository
public class StudentDaoImpl implements StudentDao {

    @Autowired
    JdbcTemplate jdbcTemplate;
    @Override
    public List<Student> getAllStudent() {
        String getStudentDetails = "select * from etm.student";
        List<Map<String, Object>> resultList = jdbcTemplate.queryForList(getStudentDetails);
        List<Student> students = new ArrayList<>();
        resultList.forEach(r ->{
            Student s = new Student((Integer) r.get("student_id"), (String) r.get("first_name"), (String) r.get("last_name"));
            students.add(s);
        });

        return students;
    }
}
