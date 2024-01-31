package com.hexaware.springdatajpaassignment.entity;

import java.time.LocalDate;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

@Component
@Entity
public class Certification {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Min(1)
	private long id;
	
	@NotEmpty
	private String title;
	
	@NotEmpty
	@Pattern(regexp="^[A-Z][a-zA-Z\\s]*$")
	private String description;
	
	@NotNull
	private LocalDate startDate;
	
	@NotNull
	private LocalDate endDate;
	
	public Certification() {
		super();
	}

	public Certification(long id, String title, String description, LocalDate startDate, LocalDate endDate) {
		super();
		this.id=id;
		this.title = title;
		this.description = description;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id=id;
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

