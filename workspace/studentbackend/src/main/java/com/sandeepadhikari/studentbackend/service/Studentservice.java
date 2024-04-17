package com.sandeepadhikari.studentbackend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sandeepadhikari.studentbackend.model.Student;
import com.sandeepadhikari.studentbackend.repository.Studentrepo;

@Service
public class Studentservice {

	@Autowired
	Studentrepo Repo;
	
	public List<Student> getalldatabase() {
		// TODO Auto-generated method stub
		return Repo.findAll();
		
	}

	public Student getstudentid(Integer studentid) {
		// TODO Auto-generated method stub
		return Repo.findById(studentid).get();
	}

	public void deletestudent(Integer studentid) {
		// TODO Auto-generated method stub
		 Repo.deleteById(studentid);
	}

	public Student addstudent(Student newStudent) {
		// TODO Auto-generated method stub
		return Repo.save(newStudent);
	}

	public Student updatestudent(Student updateStudent) {
		// TODO Auto-generated method stub
		
		
		Student oldStudent = Repo.findById(updateStudent.getStudentid()).get();
		if(!oldStudent.getCity().equals(updateStudent.getCity())) {
		oldStudent.setCity(updateStudent.getCity());}
		
		if(!oldStudent.getGrade().equals(updateStudent.getGrade())) {
		oldStudent.setGrade(updateStudent.getGrade());}
		
		if(!oldStudent.getName().equals(updateStudent.getName())) {
		oldStudent.setName(updateStudent.getName());}
		
		if(!oldStudent.getPhone().equals(updateStudent.getPhone())) {
		oldStudent.setPhone(updateStudent.getPhone());}
		
		return Repo.save(oldStudent);
	}

	
}
