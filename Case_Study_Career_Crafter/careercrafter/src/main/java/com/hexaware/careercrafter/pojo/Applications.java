package com.hexaware.careercrafter.pojo;

import java.time.LocalDate;

import org.springframework.stereotype.Component;

@Component
public class Applications {
	
	private String companyName;
	private String profile;
	private LocalDate appliedDate;
	private String status;
	private String coverLetter;
	
	public Applications() {
		
	}
	
	public Applications(String companyName, String profile, LocalDate appliedDate, String status, String coverLetter) {
		super();
		this.companyName = companyName;
		this.profile = profile;
		this.appliedDate = appliedDate;
		this.status = status;
		this.coverLetter = coverLetter;
	}
	
	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getProfile() {
		return profile;
	}

	public void setProfile(String profile) {
		this.profile = profile;
	}

	public LocalDate getAppliedDate() {
		return appliedDate;
	}

	public void setAppliedDate(LocalDate appliedDate) {
		this.appliedDate = appliedDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getCoverLetter() {
		return coverLetter;
	}

	public void setCoverLetter(String coverLetter) {
		this.coverLetter = coverLetter;
	}

	@Override
	public String toString() {
		return "Applications [companyName=" + companyName + ", profile=" + profile + ", appliedDate=" + appliedDate
				+ ", status=" + status + ", coverLetter=" + coverLetter + "]";
	}

	
}
