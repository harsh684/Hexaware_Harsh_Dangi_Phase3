package com.hexaware.springdatajpaassignment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.springdatajpaassignment.entity.Certification;
import com.hexaware.springdatajpaassignment.repository.CertificationRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class CertificateServiceImp implements ICertificationService {

	@Autowired
	CertificationRepository repo;
	
	@Override
	public Certification addCertificate(Certification c) {
		// TODO Auto-generated method stub
		return repo.save(c);
	}

	@Override
	public Certification updateCertificate(Certification c) {
		// TODO Auto-generated method stub
		return repo.save(c);
	}

	@Override
	public Certification selectOne(long cid) {
		// TODO Auto-generated method stub
		return repo.findById(cid).orElse(null);
	}

	@Override
	public List<Certification> selectAll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public String deleteCertificate(long id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
		return "Row deleted";
	}
	
	@Override
	public Certification findByTitle(String title) {
		// TODO Auto-generated method stub
		return repo.findByTitle(title);
	}

	@Override
	public String deleteCertificateById(String title) {
		return repo.deleteCertificateByTitle(title)+" rows deleted";
	}
	
	

}
