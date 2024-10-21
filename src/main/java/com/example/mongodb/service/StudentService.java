package com.example.mongodb.service;

import com.example.mongodb.entity.Course;
import com.example.mongodb.entity.Student;
import com.example.mongodb.repository.CourseRepository;
import com.example.mongodb.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;



    public void add(Student student){
        studentRepository.save(student);
    }

    public List<Student> findByFirstNameStartingWith(String firstName){
       return studentRepository.findByFirstNameStartingWith(firstName);
    }

    public List<Student> findBySureNameEndingWith(String sureName){
        return studentRepository.findBySureNameEndingWith(sureName);
    }

    public void delete(String id){
        studentRepository.deleteById(id);
    }
}
