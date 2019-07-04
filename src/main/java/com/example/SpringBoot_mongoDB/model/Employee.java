package com.example.SpringBoot_mongoDB.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("Employee")
public class Employee {

@Id
private ObjectId  _id;
public String get_id() {
	return _id.toHexString();
}

public void set_id(ObjectId _id) {
	this._id = _id;
}


private	String  empname,empemail;

public String getEmpname() {
	return empname;
}

public void setEmpname(String empname) {
	this.empname = empname;
}

public String getEmpemail() {
	return empemail;
}

public void setEmpemail(String empemail) {
	this.empemail = empemail;
}


public  Employee(ObjectId  _id,String empname,  String empemail)
{
	this.empname=empname;
	this.empemail=empemail;
	this._id=_id;
}



 
}
