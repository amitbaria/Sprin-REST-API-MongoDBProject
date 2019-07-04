package com.example.SpringBoot_mongoDB.repository;
import com.example.SpringBoot_mongoDB.model.*;

import org.springframework.stereotype.Repository;
import org.springframework.data.mongodb.repository.MongoRepository;

@Repository
public interface EmployeeRepository extends MongoRepository < Employee,String> {
	
	public Employee  getBy_id();

}
