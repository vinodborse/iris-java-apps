package com.vinod.model;

public class Student {
	
	private int rollNo;
	private String name;
	private String address;
	private int mobile;
	private int std;
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getMobile() {
		return mobile;
	}
	public void setMobile(int mobile) {
		this.mobile = mobile;
	}
	public int getStd() {
		return std;
	}
	public void setStd(int std) {
		this.std = std;
	}
	
	public Student() {}
	
	public Student(int rollNo, String name, String address, int mobile, int std) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.address = address;
		this.mobile = mobile;
		this.std = std;
	}
	
	

}
