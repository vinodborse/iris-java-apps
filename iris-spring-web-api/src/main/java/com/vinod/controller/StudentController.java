package com.vinod.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vinod.model.Student;
import com.vinod.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	StudentService studentService;
	
	@GetMapping("/student/{sname}")
	public Student getStudentByName(@PathVariable("sname") String name) {
		
		return studentService.getStudentByName(name);
	}
	
	@PostMapping("/add-student")
	public Student addStudent(@RequestBody Student student) {
		Student s1 = new Student(student.getRollNo(), student.getName(), student.getAddress(), student.getMobile(), student.getStd());
		return s1;
	}

}



//@RestController => @Controller + @ResponseBody




// @Component -> @Controller/@RestController -> @Service -> @Repository