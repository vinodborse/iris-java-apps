package com.vinod.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.vinod.model.Employee;
import com.vinod.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;
	
	@GetMapping("/employee/{id}")
	public Employee getEmployee(@PathVariable("id")Long id) {
		return employeeService.getEmployee(id);
	}
	
	@PostMapping("/employee")
	public Employee saveEmployee(@RequestBody Employee employee) {
		return employeeService.saveEmployee(employee);
	}
	
	@GetMapping("/employees")
	public List<Employee> getEmployeeByCity(@RequestParam("city")String city) {
		return employeeService.getEmployeesByCity(city);
	}
}
