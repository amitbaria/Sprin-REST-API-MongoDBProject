package com.example.SpringBoot_mongoDB.model;

import java.util.List;
import java.util.Map;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("Student")
public class Student {
	
	@Id
	private ObjectId  _id;
	public String get_id() {
		return _id.toHexString();
	}

	public void set_id(ObjectId _id) {
		this._id = _id;
	}
	
	public String getStudentname() {
		return studentname;
	}

	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}

	public List<StudentAddress> getStudentAddress() {
		return studentAddress;
	}

	public void setStudentAddress(List< StudentAddress> studentAddress) {
		this.studentAddress = studentAddress;
	}

	private  String studentname;
	private  List<StudentAddress>  studentAddress;
	private  StudentDOB  studentDOB;
	public StudentDOB getStudentDOB() {
		return studentDOB;
	}

	public void setStudentDOB(StudentDOB studentDOB) {
		this.studentDOB = studentDOB;
	}
	
	 
	
	
	


}
