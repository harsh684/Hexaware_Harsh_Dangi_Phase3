package com.hexaware.jdbcassignment.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.hexaware.jdbcassignment.beans.Certification;

public class CertificateMapper implements RowMapper<Certification>{

	@Override
	public Certification mapRow(ResultSet rs, int rowNum) throws SQLException {

		Certification c = new Certification();
		
		c.setTitle(rs.getString("title"));
		c.setStartDate(rs.getDate("startDate").toLocalDate());
		c.setEndDate(rs.getDate("endDate").toLocalDate());
		c.setDescription(rs.getString("descr"));
		
		return c;
	}

}
