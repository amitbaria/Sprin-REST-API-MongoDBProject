package com.example.SpringBoot_mongoDB.service;

import java.util.List;

import com.example.SpringBoot_mongoDB.model.Employee;
import com.example.SpringBoot_mongoDB.model.Student;

public interface serviceMethods {
	
	
public List<Employee> showEmployeeDetails();


public List<Student>  getStudentDetailsService();

}
