package com.sandeepadhikari.studentbackend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sandeepadhikari.studentbackend.model.Student;
import com.sandeepadhikari.studentbackend.service.Studentservice;

@RestController

public class StudentController {
	
	@Autowired
	Studentservice service;
	
	@GetMapping("/hello")
public String sayHello() {
	return "Hello friend my friend";
	}
	
	@GetMapping("/hellousername")
	public String getusername(String username) {
		return "Hello  "+username+"  my friend";
	}
	
	@GetMapping("/all")
	public List<Student> getalldatabase() {
		return service.getalldatabase();
	}
	
	@GetMapping("/{studentid}")	
	public Student getstudentid(@PathVariable Integer studentid) {
	return service.getstudentid(studentid);
}
 @DeleteMapping("/{studentid}")
 public void deletestudent(@PathVariable Integer studentid) {
 service.deletestudent(studentid);	
 }
 
 @PostMapping("/add")
 public Student addstudent(@RequestBody Student newStudent) {
 return service.addstudent(newStudent);
	 	 
 }
 
 @PutMapping("/update")
 public Student updatestudent(@RequestBody Student updateStudent) {
 return service.updatestudent(updateStudent);
 
 
 }
 }
 
 
 

