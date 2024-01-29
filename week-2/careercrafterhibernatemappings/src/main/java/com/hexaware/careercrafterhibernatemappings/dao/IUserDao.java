package com.hexaware.careercrafterhibernatemappings.dao;

import java.util.List;

import com.hexaware.careercrafterhibernatemappings.pojo.Applications;
import com.hexaware.careercrafterhibernatemappings.pojo.JobSeeker;
import com.hexaware.careercrafterhibernatemappings.pojo.Listing;

public interface IUserDao {

	public boolean createProfile();
	
	public boolean updateProfile();
	
	public List<Listing> searchJobs();
	
	public boolean applyForJob(Listing listing);
	
	public List<Applications> getAppliedJobs(JobSeeker seeker);
	
	public String trackStatus();
	
}
