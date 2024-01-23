package com.hexaware.jdbcassignment.service;

import java.util.List;

import com.hexaware.jdbcassignment.beans.Certification;

public interface ICertificateService {

	public boolean insertCertification(Certification c);
	
	public Certification selectCertification(String a);
	public List<Certification> selectAllCertification();
}
