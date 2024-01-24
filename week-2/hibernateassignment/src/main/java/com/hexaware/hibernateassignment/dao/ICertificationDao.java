package com.hexaware.hibernateassignment.dao;

import java.util.List;

import com.hexaware.hibernateassignment.bean.Certification;

public interface ICertificationDao {

	public boolean insertCertification(Certification c);
	
	public boolean updateCertification(Certification c);
	
	public boolean deleteCertification(String title);
	
	public Certification selectOne(String title);
	
	public List<Certification> selectAll();
	
}
