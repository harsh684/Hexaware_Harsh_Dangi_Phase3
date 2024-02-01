package com.hexaware.springdatajpaassignment.restcontroller;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.hexaware.springdatajpaassignment.entity.Certification;

@SpringBootTest
class CertificateRestContollerTest {

	@Autowired
	RestTemplate restTemplate;
	
	@Test
	void testGetById() {
		int  id = 1;
		ResponseEntity<Certification> res = restTemplate.getForEntity("http://localhost:8080/api/certification/get/"+id, Certification.class);
		assertNotNull(res.getBody());
	}

	@Test
	void testGetAll() {
		List<Certification> list = restTemplate.getForObject("http://localhost:8080/api/certification/getall", List.class);
		assertFalse(list.isEmpty());
	}

	@Test
	void testAddCertification() {
//		Certification c = new Certification(2,"Python","Python",LocalDate.parse("2024-01-01"),LocalDate.parse("2024-02-01"));
//	
//		ResponseEntity<Certification> res = restTemplate.postForEntity("http://localhost:8080/api/certification/add", c, Certification.class);
//	
//		assertNotNull(res.getBody());
	}

	@Test
	void testUpdateCertification() {
		Certification c = new Certification(52,"Python updated","Python",LocalDate.parse("2024-01-02"),LocalDate.parse("2024-01-31"));
		
		restTemplate.put("http://localhost:8080/api/certification/update/"+c.getId(), c);
	
		assertTrue(true);
	}

	@Test
	void testDeleteByTitle() {
		restTemplate.delete("http://localhost:8080/api/certification/delete/53");
	
		assertTrue(true);
	}

}
