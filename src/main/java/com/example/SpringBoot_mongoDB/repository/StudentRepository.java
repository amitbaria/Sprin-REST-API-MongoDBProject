package com.example.SpringBoot_mongoDB.repository;



import com.example.SpringBoot_mongoDB.model.*;

import org.springframework.stereotype.Repository;
import org.springframework.data.mongodb.repository.MongoRepository;

@Repository
public interface StudentRepository extends MongoRepository < Student,String> {
	
	public Student  getBy_id();

}