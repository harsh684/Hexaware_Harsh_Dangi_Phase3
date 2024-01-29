package com.hexaware.careercrafterhibernatemappings.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Accomplishments {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int accomplishmentId;
	private String description;
	public Accomplishments() {
		super();
	}
	public Accomplishments(int accomplishmentId, String description) {
		super();
		this.accomplishmentId = accomplishmentId;
		this.description = description;
	}
	public int getAccomplishmentId() {
		return accomplishmentId;
	}
	public void setAccomplishmentId(int accomplishmentId) {
		this.accomplishmentId = accomplishmentId;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "Accomplishments [accomplishmentId=" + accomplishmentId + ", description=" + description + "]";
	}
	
	
	
}
