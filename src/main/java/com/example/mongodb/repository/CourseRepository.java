package com.example.mongodb.repository;

import com.example.mongodb.entity.Course;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CourseRepository extends MongoRepository<Course,String>{

}