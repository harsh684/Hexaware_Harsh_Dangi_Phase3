package com.hexaware.careercrafterhibernatemappings.dao;

public interface IRegisterationAuthentication {

	public boolean registerUser();
	
	public boolean registerEmployer();
	
	public boolean authenticateUser();
	
	public boolean authenticateEmployer();
}
