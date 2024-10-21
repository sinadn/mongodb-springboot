package com.example.mongodb.controller;

import com.example.mongodb.entity.Student;
import com.example.mongodb.entity.Teacher;
import com.example.mongodb.repository.StudentRepository;
import com.example.mongodb.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TeacherController {

    @Autowired
    private TeacherRepository teacherRepository;

    // Save method is predefine method in Mongo Repository
    // with this method we will save user in our database
    @PostMapping("/addTeacher")
    public Teacher addTeacher(@RequestBody Teacher teacher) {
        return teacherRepository.save(teacher);
    }

    // findAll method is predefine method in Mongo Repository
    // with this method we will all user that is save in our database
    @GetMapping("/getAllTeacher")
    public List<Teacher> getAllTeacher(){
        return teacherRepository.findAll();
    }
}