package com.vinod.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vinod.dao.StudentRepository;
import com.vinod.model.Student;

@Service
public class StudentService {
	
	@Autowired
	StudentRepository studentRepository;

	public Student getStudentByName(String name) {
		//business logic 
		
		return studentRepository.getStudentByName(name);
	}
}
