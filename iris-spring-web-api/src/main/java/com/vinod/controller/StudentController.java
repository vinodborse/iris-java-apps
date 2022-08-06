package com.vinod.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import com.vinod.model.Student;

@Controller
public class StudentController {
	
	@GetMapping("/student/{sname}")
	public @ResponseBody Student getStudentByName(@PathVariable("sname") String name) {
		
	
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