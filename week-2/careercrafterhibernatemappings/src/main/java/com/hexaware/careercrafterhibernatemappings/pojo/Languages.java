package com.hexaware.careercrafterhibernatemappings.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Languages {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int languageId;
	
	private String languageName;

	public Languages() {
		super();
	}

	public Languages(int languageId, String languageName) {
		super();
		this.languageId = languageId;
		this.languageName = languageName;
	}

	public int getLanguageId() {
		return languageId;
	}

	public void setLanguageId(int languageId) {
		this.languageId = languageId;
	}

	public String getLanguageName() {
		return languageName;
	}

	public void setLanguageName(String languageName) {
		this.languageName = languageName;
	}

	@Override
	public String toString() {
		return "Languages [languageId=" + languageId + ", languageName=" + languageName + "]";
	}
	
	
}
