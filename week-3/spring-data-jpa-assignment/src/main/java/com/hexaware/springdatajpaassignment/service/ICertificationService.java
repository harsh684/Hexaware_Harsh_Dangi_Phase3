package com.hexaware.springdatajpaassignment.service;

import java.util.List;

import com.hexaware.springdatajpaassignment.entity.Certification;

public interface ICertificationService {

	public Certification addCertificate(Certification c);
	
	public Certification updateCertificate(Certification c);
	
	public Certification selectOne(long cid);
	
	public List<Certification> selectAll();
	
	public String deleteCertificate(long id);

	public String deleteCertificateById(String title);

	public Certification findByTitle(String title);
}
