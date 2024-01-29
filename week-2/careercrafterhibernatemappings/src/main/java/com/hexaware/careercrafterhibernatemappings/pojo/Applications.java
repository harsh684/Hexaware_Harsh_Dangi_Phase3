package com.hexaware.careercrafterhibernatemappings.pojo;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Component
@Entity
public class Applications {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int applicationId;
	
	private String companyName;
	private String profile;
	private LocalDate appliedDate;
	private String status;
	private String coverLetter;
	
	//listingid
	
	public Applications() {
		
	}

	public Applications(int applicationId, String companyName, String profile, LocalDate appliedDate, String status,
			String coverLetter) {
		super();
		this.applicationId = applicationId;
		this.companyName = companyName;
		this.profile = profile;
		this.appliedDate = appliedDate;
		this.status = status;
		this.coverLetter = coverLetter;
	}

	public int getApplicationId() {
		return applicationId;
	}

	public void setApplicationId(int applicationId) {
		this.applicationId = applicationId;
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
		return "Applications [applicationId=" + applicationId + ", companyName=" + companyName + ", profile=" + profile
				+ ", appliedDate=" + appliedDate + ", status=" + status + ", coverLetter=" + coverLetter + "]";
	}
	
	
	
}
