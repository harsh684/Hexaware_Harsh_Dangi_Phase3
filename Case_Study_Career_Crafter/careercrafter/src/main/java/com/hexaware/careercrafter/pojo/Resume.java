package com.hexaware.careercrafter.pojo;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class Resume {
	
	private String address;
	private List<String> languages;
	private List<String> skills;
	private List<String> referenceLinks;
	private List<String> accomplishments;
	private List<WorkExperience> experiences;
	private List<Education> education;
	private List<Project> projects;
	private List<Certification> certifications;
	
	public Resume() {}
	
	public Resume(String address, List<String> languages, List<String> skills, List<String> referenceLinks,
			List<String> accomplishments, List<WorkExperience> experiences, List<Education> education,
			List<Project> projects, List<Certification> certifications) {
		super();
		this.address = address;
		this.languages = languages;
		this.skills = skills;
		this.referenceLinks = referenceLinks;
		this.accomplishments = accomplishments;
		this.experiences = experiences;
		this.education = education;
		this.projects = projects;
		this.certifications = certifications;
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public List<String> getLanguages() {
		return languages;
	}
	public void setLanguages(List<String> languages) {
		this.languages = languages;
	}
	public List<String> getSkills() {
		return skills;
	}
	public void setSkills(List<String> skills) {
		this.skills = skills;
	}
	public List<String> getReferenceLinks() {
		return referenceLinks;
	}
	public void setReferenceLinks(List<String> referenceLinks) {
		this.referenceLinks = referenceLinks;
	}
	public List<String> getAccomplishments() {
		return accomplishments;
	}
	public void setAccomplishments(List<String> accomplishments) {
		this.accomplishments = accomplishments;
	}
	public List<WorkExperience> getExperiences() {
		return experiences;
	}
	public void setExperiences(List<WorkExperience> experiences) {
		this.experiences = experiences;
	}
	public List<Education> getEducation() {
		return education;
	}
	public void setEducation(List<Education> education) {
		this.education = education;
	}
	public List<Project> getProjects() {
		return projects;
	}
	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}
	public List<Certification> getCertifications() {
		return certifications;
	}
	public void setCertifications(List<Certification> certifications) {
		this.certifications = certifications;
	}
	@Override
	public String toString() {
		return "Resume [address=" + address + ", languages=" + languages + ", skills=" + skills + ", referenceLinks="
				+ referenceLinks + ", accomplishments=" + accomplishments + ", experiences=" + experiences
				+ ", education=" + education + ", projects=" + projects + ", certifications=" + certifications + "]";
	}


}
