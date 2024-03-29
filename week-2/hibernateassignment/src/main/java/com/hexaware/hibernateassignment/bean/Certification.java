package com.hexaware.hibernateassignment.bean;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table
@NamedQueries(
	@NamedQuery(name="selectAllCertification",query="select c from Certification c")
)
public class Certification {

	@Id
	private String title;
	private String description;
	private LocalDate startDate;
	private LocalDate endDate;
	
	public Certification() {
		super();
	}

	public Certification(String title, String description, LocalDate startDate, LocalDate endDate) {
		super();
		this.title = title;
		this.description = description;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
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

	@Override
	public String toString() {
		return "Certification [title=" + title + ", description=" + description + ", startDate=" + startDate
				+ ", endDate=" + endDate + "]";
	}

}
