package com.example.mongodb.service;

import com.example.mongodb.entity.Student;
import com.example.mongodb.entity.Teacher;
import com.example.mongodb.repository.StudentRepository;
import com.example.mongodb.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeacherService {

    @Autowired
    private TeacherRepository teacherRepository;

    public void add(Teacher teacher){
        teacherRepository.save(teacher);
    }
}
