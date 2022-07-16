package com.vinod.model;

public class Employee {
	
	private String firstName;
	private String lastName;

	public String getFirstName() {
		System.out.println("getFirstName");
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		System.out.println("getLastName");
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	

	

}
