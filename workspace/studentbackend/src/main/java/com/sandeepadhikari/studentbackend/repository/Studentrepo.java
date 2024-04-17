package com.sandeepadhikari.studentbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.sandeepadhikari.studentbackend.model.Student;

@Repository
public interface Studentrepo extends JpaRepository<Student,Integer>{

}
