package com.vinod.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.vinod.model.Student;

@Repository
public class StudentRepository {

	public Student getStudentByName(String name) {
		
		// Database code / qurery
		Student s1 = new Student(1, "Rahul", "Mumbai", 1232, 10);
		Student s2 = new Student(2, "vinod", "Pune", 1234, 10);
		Student s3 = new Student(3, "Komal", "Pune", 2121, 10);
		Student s4 = new Student(4, "Dhaval", "Mumbai", 4567, 10);

		List<Student> students = new ArrayList<Student>();
		
		students.add(s1);
		students.add(s2);
		students.add(s3);
		students.add(s4);
		
		for(Student s: students) {
			if(s.getName().equals(name)) {
				return s;
			}
		}
		return null;
	}
}
