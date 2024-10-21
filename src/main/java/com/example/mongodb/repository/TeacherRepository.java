package com.example.mongodb.repository;

import com.example.mongodb.entity.Address;
import com.example.mongodb.entity.Teacher;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TeacherRepository extends MongoRepository<Teacher,String>{

}