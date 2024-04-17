package com.sandeepadhikari.studentbackend.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="student")
public class Student {

	@Id
	//@GeneratedValue(strategy=GenerationType.AUTO)
	int studentid;
	
	public int getStudentid() {
		return studentid;
	}

	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	@Column(name ="name")
	String name;
	
	@Column(name="phone")
	String phone;
	
	@Column(name="City")
	String city;
	
	@Column(name="grade")
	String grade;

	public Student(int studentid, String name, String phone, String city, String grade) {
		super();
		this.studentid = studentid;
		this.name = name;
		this.phone = phone;
		this.city = city;
		this.grade = grade;
	}

	public Student() {
		super();
	}
	
}
