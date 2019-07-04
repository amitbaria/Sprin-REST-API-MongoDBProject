# Sprin-REST-API-MongoDBProject

1.   Add data in mongo db database  using MongoDb shell
  a) create database
  b) create Collection "Student"


db.Student.insert({

       studentname:"sachin",

     studentAddress:[
	            
				  {
		            city:"mohali",
					state:"punjab",
					country:"India",
					pincode:"160059"
				  }
				  
				],
	 studentDOB:
                {
				  dd:"20",
				  mm:"07",
				  yyyy:"1990"
				}	 
				
})


2).....Run  Tomcate Apahe Server....using command  mvn spring-boot:run

3)......Open Postman  and trigger the URL:    "http://localhost:8080/getStudentDetails"


