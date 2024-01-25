package com.hexaware.careercrafter.pojo;

import java.time.LocalDate;
import java.util.Optional;

import org.springframework.stereotype.Component;

@Component
public class Project {
	
	private String title;
	private String description;
	private LocalDate startDate;
	private LocalDate endDate;
	private String referenceLink;
	private Optional<String> hostedlink;
	
	public Project() {}
	
	public Project(String title, String description, LocalDate startDate, LocalDate endDate, String referenceLink,
			Optional<String> hostedlink) {
		super();
		this.title = title;
		this.description = description;
		this.startDate = startDate;
		this.endDate = endDate;
		this.referenceLink = referenceLink;
		this.hostedlink = hostedlink;
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
	public String getReferenceLink() {
		return referenceLink;
	}
	public void setReferenceLink(String referenceLink) {
		this.referenceLink = referenceLink;
	}
	public Optional<String> getHostedlink() {
		return hostedlink;
	}
	public void setHostedlink(Optional<String> hostedlink) {
		this.hostedlink = hostedlink;
	}
	@Override
	public String toString() {
		return "Project [title=" + title + ", description=" + description + ", startDate=" + startDate + ", endDate="
				+ endDate + ", referenceLink=" + referenceLink + ", hostedlink=" + hostedlink + "]";
	}
	
	
}
