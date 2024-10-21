package com.example.mongodb.service;

import com.example.mongodb.entity.Address;
import com.example.mongodb.entity.Course;
import com.example.mongodb.repository.AddressRepository;
import com.example.mongodb.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    @Autowired
    private MongoTemplate mt;


    public void add(Course course){
        courseRepository.save(course);
    }


    public List<Course> getAllByName(String name){
        Query query = new Query();
        query.addCriteria(Criteria.where("name").regex("^"+name));
        return mt.find(query,Course.class);
    }

    public List<Course> getAllByTerm(String term){
        Query query = new Query();
        query.addCriteria(Criteria.where("term").is(term));
        return mt.find(query,Course.class);
    }

    public void delete(String id){
        courseRepository.deleteById(id);
    }

}
