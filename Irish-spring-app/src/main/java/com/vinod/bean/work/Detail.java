package com.vinod.bean.work;

public class Detail {
	
	private Student student;

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
	
	
	
	public void studentDetail() {
		
		System.out.println("Hello " + getStudent().getFirstName() + " " + getStudent().getLastName());
		
	}
	

}
