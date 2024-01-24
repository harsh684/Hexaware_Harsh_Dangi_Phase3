package com.hexaware.hibernateassignment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.hibernateassignment.bean.Certification;
import com.hexaware.hibernateassignment.dao.ICertificationDao;

@Service
public class CertificationServiceImp implements ICertificationService {

	@Autowired
	ICertificationDao dao;
	
	@Override
	public boolean insertCertification(Certification c) {
		// TODO Auto-generated method stub
		return dao.insertCertification(c);
	}

	@Override
	public boolean updateCertification(Certification c) {
		// TODO Auto-generated method stub
		return dao.updateCertification(c);
	}

	@Override
	public Certification selectOne(String title) {
		// TODO Auto-generated method stub
		return dao.selectOne(title);
	}

	@Override
	public List<Certification> selectAll() {
		// TODO Auto-generated method stub
		return dao.selectAll();
	}

	@Override
	public boolean deleteCertification(String title) {
		// TODO Auto-generated method stub
		return dao.deleteCertification(title);
	}

}
