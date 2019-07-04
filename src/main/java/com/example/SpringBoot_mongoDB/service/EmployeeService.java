package com.example.SpringBoot_mongoDB.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SpringBoot_mongoDB.model.Employee;
import com.example.SpringBoot_mongoDB.model.Student;
import com.example.SpringBoot_mongoDB.repository.EmployeeRepository;
import com.example.SpringBoot_mongoDB.repository.StudentRepository;

@Service
public class EmployeeService  implements serviceMethods 
 {

	@Autowired
	private EmployeeRepository  employeeRepository;
	
	
	@Autowired
	private StudentRepository  studentRepository;
	

	@Override
	public List<Employee> showEmployeeDetails() {
		  List<Employee>	employee	=employeeRepository.findAll();
		    
	      return employee;
	}

	@Override
	public List<Student> getStudentDetailsService() {
		
		List<Student>	student	=studentRepository.findAll();
		
		  return student;
	}
	
	
	
	
	

  }
