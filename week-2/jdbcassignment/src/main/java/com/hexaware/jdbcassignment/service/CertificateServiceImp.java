package com.hexaware.jdbcassignment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.jdbcassignment.beans.Certification;
import com.hexaware.jdbcassignment.dao.ICertificateDao;

@Service
public class CertificateServiceImp implements ICertificateService {
	
	@Autowired
	public ICertificateDao dao;
	
	@Override
	public boolean insertCertification(Certification c) {
		// TODO Auto-generated method stub
		return dao.insertCertification(c);
	}

	@Override
	public Certification selectCertification(String title) {
		// TODO Auto-generated method stub
		return dao.selectCertification(title);
	}

	@Override
	public List<Certification> selectAllCertification() {
		// TODO Auto-generated method stub
		return dao.selectAllCertification();
	}

}
