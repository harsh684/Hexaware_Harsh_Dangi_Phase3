package com.hexaware.springcore.entities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Employee {

	private int eid;
	private String name;
	
	@Autowired
	private Address address;
	
	@Autowired
	private String string;
	
	public Employee() {}
	
	public Employee(int eid, String name, Address address) {
		super();
		this.eid = eid;
		this.name = name;
		this.address = address;
	}

	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	
}
