package com.hexaware.careercrafter.pojo;

import java.time.LocalDate;

import org.springframework.stereotype.Component;

@Component
public class Education {

	private String collegeName;
	private String degree;
	private String specialization;
	private LocalDate startdate;
	private LocalDate endDate;
	private double percentage;
	
	public Education() {}
	
	public Education(String collegeName, String degree, String specialization, LocalDate startdate, LocalDate endDate,
			double percentage) {
		super();
		this.collegeName = collegeName;
		this.degree = degree;
		this.specialization = specialization;
		this.startdate = startdate;
		this.endDate = endDate;
		this.percentage = percentage;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	public LocalDate getStartdate() {
		return startdate;
	}

	public void setStartdate(LocalDate startdate) {
		this.startdate = startdate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

	@Override
	public String toString() {
		return "Education [collegeName=" + collegeName + ", degree=" + degree + ", specialization=" + specialization
				+ ", startdate=" + startdate + ", endDate=" + endDate + ", percentage=" + percentage + "]";
	}
	
	
	
}
