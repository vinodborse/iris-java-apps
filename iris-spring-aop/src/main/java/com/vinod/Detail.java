package com.vinod;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.vinod.model.Employee;

@Component
public class Detail {
	
	private Employee employee;

	public Employee getEmployee() {
		return employee;
	}

	@Autowired
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public void display() {
		System.out.println("Hello " +getEmployee().getFirstName()+" "+ getEmployee().getLastName()+ " We are in display method..!!!!");
	}

}
