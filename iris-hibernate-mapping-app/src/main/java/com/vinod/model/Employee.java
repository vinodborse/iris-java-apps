package com.vinod.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Employee {
	
	@Id
	@GeneratedValue
	private int id;
	
	private String name;
	
	private String address;
	
	/*
	 * @OneToOne
	 * 
	 * @JoinColumn(name = "mob_p_id") private Mobile mobile;
	 * 
	 * public Mobile getMobile() { return mobile; }
	 * 
	 * public void setMobile(Mobile mobile) { this.mobile = mobile; }
	 */

	/*
	 * @OneToMany
	 * 
	 * @JoinTable(name = "emp_mob", joinColumns = @JoinColumn(name = "emp_id"),
	 * inverseJoinColumns = @JoinColumn(name = "mob_id")) private List<Mobile>
	 * mobile = new ArrayList<Mobile>();
	 */
	
	/*
	 * @OneToMany(mappedBy = "employee") private List<Mobile> mobile = new
	 * ArrayList<Mobile>();
	 */
	
	@ManyToMany
	private List<Mobile> mobile = new ArrayList<Mobile>();
	
	public List<Mobile> getMobile() {
		return mobile;
	}

	public void setMobile(List<Mobile> mobile) {
		this.mobile = mobile;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
	
	

}
