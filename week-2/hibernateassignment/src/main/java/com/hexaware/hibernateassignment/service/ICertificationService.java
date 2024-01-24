package com.hexaware.hibernateassignment.service;

import java.util.List;

import com.hexaware.hibernateassignment.bean.Certification;

public interface ICertificationService {

	public boolean insertCertification(Certification c);
	
	public boolean updateCertification(Certification c);
	
	public Certification selectOne(String title);
	
	public List<Certification> selectAll();
}
