package com.hexaware.careercrafter.pojo;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class Listing {
	
	private String profile;
	private String department;
	private String location;
	private int experienceReqFrom;
	private int experienceReqTo;
	private double salary;
	private LocalDate postDate;
	private List<String> reqSkills;
	private String jd;
	private String benefitsProvided;
	
	public Listing() {}
	
	public Listing(String profile, String department, String location, int experienceReqFrom, int experienceReqTo,
			double salary, LocalDate postDate, List<String> reqSkills, String jd, String benefitsProvided) {
		super();
		this.profile = profile;
		this.department = department;
		this.location = location;
		this.experienceReqFrom = experienceReqFrom;
		this.experienceReqTo = experienceReqTo;
		this.salary = salary;
		this.postDate = postDate;
		this.reqSkills = reqSkills;
		this.jd = jd;
		this.benefitsProvided = benefitsProvided;
	}

	public String getProfile() {
		return profile;
	}

	public void setProfile(String profile) {
		this.profile = profile;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getExperienceReqFrom() {
		return experienceReqFrom;
	}

	public void setExperienceReqFrom(int experienceReqFrom) {
		this.experienceReqFrom = experienceReqFrom;
	}

	public int getExperienceReqTo() {
		return experienceReqTo;
	}

	public void setExperienceReqTo(int experienceReqTo) {
		this.experienceReqTo = experienceReqTo;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public LocalDate getPostDate() {
		return postDate;
	}

	public void setPostDate(LocalDate postDate) {
		this.postDate = postDate;
	}

	public List<String> getReqSkills() {
		return reqSkills;
	}

	public void setReqSkills(List<String> reqSkills) {
		this.reqSkills = reqSkills;
	}

	public String getJd() {
		return jd;
	}

	public void setJd(String jd) {
		this.jd = jd;
	}

	public String getBenefitsProvided() {
		return benefitsProvided;
	}

	public void setBenefitsProvided(String benefitsProvided) {
		this.benefitsProvided = benefitsProvided;
	}

	@Override
	public String toString() {
		return "Listing [profile=" + profile + ", department=" + department + ", location=" + location
				+ ", experienceReqFrom=" + experienceReqFrom + ", experienceReqTo=" + experienceReqTo + ", salary="
				+ salary + ", postDate=" + postDate + ", reqSkills=" + reqSkills + ", jd=" + jd + ", benefitsProvided="
				+ benefitsProvided + "]";
	}
	
	
}
