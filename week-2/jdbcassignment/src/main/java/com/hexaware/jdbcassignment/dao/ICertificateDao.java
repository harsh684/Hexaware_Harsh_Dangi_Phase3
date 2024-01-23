package com.hexaware.jdbcassignment.dao;

import java.util.List;

import com.hexaware.jdbcassignment.beans.Certification;

public interface ICertificateDao {

	public boolean insertCertification(Certification c);
	
	public Certification selectCertification(String a);
	public List<Certification> selectAllCertification();
}
