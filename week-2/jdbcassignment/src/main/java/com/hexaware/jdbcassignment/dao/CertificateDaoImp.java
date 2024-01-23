package com.hexaware.jdbcassignment.dao;

import java.sql.Date;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.hexaware.jdbcassignment.beans.Certification;

@Repository
public class CertificateDaoImp implements ICertificateDao {

	
	JdbcTemplate template;
	
	@Autowired
	public CertificateDaoImp(DataSource dataSource) {
		
		template = new JdbcTemplate(dataSource);
		
		System.out.println(template);
	}
	
	@Override
	public boolean insertCertification(Certification c) {

		System.out.println("Wow");
		
		String insertQuery = "insert into Certification values(?,?,?,?)";
		
		int count = template.update(insertQuery, c.getTitle(),c.getDescription(),Date.valueOf(c.getStartDate()),Date.valueOf(c.getEndDate()));
		
		return count > 0;
	}

	@Override
	public Certification selectCertification(String a) {
		// TODO Auto-generated method stub
		String insertQuery = "select * from Certification";
		
		Certification  c = template.queryForObject(insertQuery, new CertificateMapper());
		
		return c;
	}

	@Override
	public List<Certification> selectAllCertification() {
		// TODO Auto-generated method stub
		String insertQuery = "select * from Certification";
		
		List<Certification> list = template.query(insertQuery,new CertificateMapper());
		
		return list;
	}

}
