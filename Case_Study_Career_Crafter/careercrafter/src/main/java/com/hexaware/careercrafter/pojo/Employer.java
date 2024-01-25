package com.hexaware.careercrafter.pojo;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class Employer {

	private int id;
	private String name;
	private String email;
	private String phno;
	private String address;
	private String comppanyName;
	private List<Listing> listings;
	private String token;
	
	public Employer() {}

	public Employer(int id, String name, String email, String phno, String address, String comppanyName,
			List<Listing> listings, String token) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phno = phno;
		this.address = address;
		this.comppanyName = comppanyName;
		this.listings = listings;
		this.token = token;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhno() {
		return phno;
	}

	public void setPhno(String phno) {
		this.phno = phno;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getComppanyName() {
		return comppanyName;
	}

	public void setComppanyName(String comppanyName) {
		this.comppanyName = comppanyName;
	}

	public List<Listing> getListings() {
		return listings;
	}

	public void setListings(List<Listing> listings) {
		this.listings = listings;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	@Override
	public String toString() {
		return "Employer [id=" + id + ", name=" + name + ", email=" + email + ", phno=" + phno + ", address=" + address
				+ ", comppanyName=" + comppanyName + ", listings=" + listings + ", token=" + token + "]";
	}
	
	
}
