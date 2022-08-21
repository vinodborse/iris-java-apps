package com.vinod.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vinod.dao.EmployeeRepository;
import com.vinod.model.Employee;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;

	public Employee getEmployee(Long id) {
//		return employeeRepository.findById(id).orElse(null);
		
		return employeeRepository.findById(id).orElseThrow(
				() -> new RuntimeException("Employee with id " + id + " is not available."));
	}
	
	public Employee saveEmployee(Employee employee) {
		Employee emp = employeeRepository.save(employee);
		return emp;
	}
	
	public List<Employee> getEmployeesByCity(String city) {
		return employeeRepository.findByCity(city);
	}
}
