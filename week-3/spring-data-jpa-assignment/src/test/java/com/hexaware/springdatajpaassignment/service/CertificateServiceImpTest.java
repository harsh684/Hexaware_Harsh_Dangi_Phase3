package com.hexaware.springdatajpaassignment.service;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.hexaware.springdatajpaassignment.entity.Certification;

@SpringBootTest
class CertificateServiceImpTest {

	@Autowired
	ICertificationService service;
	
	@Test
	void testAddCertificate() {
		Certification c= new Certification(100,"Test","Test desc",LocalDate.parse("2022-01-01"),LocalDate.parse("2022-02-02"));
		assertNotNull(service.addCertificate(c));
	}

	@Test
	void testUpdateCertificate() {
		Certification c= new Certification(100,"Testupdate","Test desc",LocalDate.parse("2022-01-01"),LocalDate.parse("2022-02-02"));
		assertNotNull(service.addCertificate(c));
	}

	@Test
	void testSelectOne() {
		assertNotNull(service.selectOne(302));
	}

	@Test
	void testSelectAll() {
		assertFalse(service.selectAll().isEmpty());
	}

	@Test
	void testDeleteCertificate() {
		service.deleteCertificate(100);
		assertTrue(true);
	}

}
