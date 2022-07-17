package com.vinod;

import com.vinod.model.Employee;

public class EmployeeOperations {

	public Employee getEmployee() {
		Employee emp = new Employee();
        
        emp.setId(4);
        emp.setFirstName("Komal");
        emp.setLastName("Patel");
        emp.setAddress("Mumbai");
        emp.setMobile(67890);
        
        return emp;
	}
}
