package com.hexaware.careercrafterhibernatemappings.pojo;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Component
@Entity
public class WorkExperience {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int experienceId;
	
	private String companyName;
	private LocalDate startDate;
	private LocalDate endDate;
	private double salary;
	private String description;
	
	public WorkExperience() {}

	public WorkExperience(int experienceId, String companyName, LocalDate startDate, LocalDate endDate, double salary,
			String description) {
		super();
		this.experienceId = experienceId;
		this.companyName = companyName;
		this.startDate = startDate;
		this.endDate = endDate;
		this.salary = salary;
		this.description = description;
	}

	public int getExperienceId() {
		return experienceId;
	}

	public void setExperienceId(int experienceId) {
		this.experienceId = experienceId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "WorkExperience [experienceId=" + experienceId + ", companyName=" + companyName + ", startDate="
				+ startDate + ", endDate=" + endDate + ", salary=" + salary + ", description=" + description + "]";
	}
	
	

}
