package com.example.SpringBoot_mongoDB.model.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringBoot_mongoDB.model.Employee;
import com.example.SpringBoot_mongoDB.model.Student;
import com.example.SpringBoot_mongoDB.service.EmployeeService;

@RestController

@ComponentScan({"com.example.SpringBoot_mongoDB.service.EmployeeService",
    "com.example.SpringBoot_mongoDB.repository.EmployeeRepository",
     "com.example.SpringBoot_mongoDB.model.Employee"})
public class EmployeeController {
	
	
   @Autowired 
   private EmployeeService  employeeService;
   
   @RequestMapping(value="/getEmployeeDetails", method=RequestMethod.GET) 
   public List<Employee>  getEmployeeDetails()
   {
	   
	   System.out.println("dddddddddd");    
	   return   employeeService.showEmployeeDetails();
	   
	   
   }
   
   @RequestMapping(value="/getStudentDetails", method=RequestMethod.GET) 
   public List<Student>  getStudentDetails()
   {
	   
	   System.out.println("dddddddddd");    
	   return   employeeService.getStudentDetailsService();
	   
	   
   }
   
	
	

}
