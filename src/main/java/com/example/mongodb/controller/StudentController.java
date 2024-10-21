package com.example.mongodb.controller;

import com.example.mongodb.entity.Student;
import com.example.mongodb.repository.StudentRepository;
import com.example.mongodb.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private StudentService studentService;


    @PostMapping("/addStudent")
    public void addStudent(@RequestBody Student student) {
         studentService.add(student);
    }

    @GetMapping("/getAllStudent")
    public List<Student> getAllStudent(){
        return studentRepository.findAll();
    }


    @GetMapping("/findByFirstNameStartingWith/{val}")
    public List<Student> findByFirstNameStartingWith(@PathVariable String val){
        return studentService.findByFirstNameStartingWith(val);
    }

    @GetMapping("/findBySureNameEndingWith/{val}")
    public List<Student> findBySureNameEndingWith(@PathVariable String val){
        return studentService.findBySureNameEndingWith(val);
    }

    @DeleteMapping("/deleteStudent/{id}")
    public void delete(@PathVariable String id) {
        studentService.delete(id);
    }


}