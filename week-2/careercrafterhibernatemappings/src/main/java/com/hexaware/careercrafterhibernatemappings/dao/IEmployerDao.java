package com.hexaware.careercrafterhibernatemappings.dao;

import java.util.List;

import com.hexaware.careercrafterhibernatemappings.pojo.Applications;
import com.hexaware.careercrafterhibernatemappings.pojo.Resume;

public interface IEmployerDao {

	public boolean createProfile();
	
	public boolean updateProfile();

	public boolean postListing();
	
	public boolean updateListing();

	public boolean deleteListing();
	
	public List<Applications> viewApplications();
	
	public boolean changeApplicationStatus();
	
	public List<Resume> manageResumeDb();

}
