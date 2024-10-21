package com.example.mongodb.controller;

import com.example.mongodb.entity.Course;
import com.example.mongodb.entity.Student;
import com.example.mongodb.repository.CourseRepository;
import com.example.mongodb.repository.StudentRepository;
import com.example.mongodb.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {

    @Autowired
    private CourseRepository courseRepository;

    @Autowired
    private CourseService courseService;


    @PostMapping("/addCourse")
    public Course addCourse(@RequestBody Course course) {
        return courseRepository.save(course);
    }


    @GetMapping("/getAllCourse")
    public List<Course> getAllCourse(){
        return courseRepository.findAll();
    }

    @GetMapping("/getAllByName/{name}")
    public List<Course> getAllByName(@PathVariable String name){
        return courseService.getAllByName(name);
    }

    @GetMapping("/getAllByTerm/{term}")
    public List<Course> getAllByTerm(@PathVariable String term){
        return courseService.getAllByTerm(term);
    }

    @DeleteMapping("/deleteCourse/{courseId}")
    public void delete(@PathVariable String  courseId){
         courseService.delete(courseId);
    }

}