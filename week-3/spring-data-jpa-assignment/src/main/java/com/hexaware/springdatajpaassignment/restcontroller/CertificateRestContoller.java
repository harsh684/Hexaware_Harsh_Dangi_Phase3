package com.hexaware.springdatajpaassignment.restcontroller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.springdatajpaassignment.entity.Certification;
import com.hexaware.springdatajpaassignment.exceptions.CertificateNotFoundException;
import com.hexaware.springdatajpaassignment.service.ICertificationService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/certification")
public class CertificateRestContoller {

	Logger logger = LoggerFactory.getLogger(CertificateRestContoller.class);

	
	@Autowired
	ICertificationService service;
	
	@GetMapping("/get/{id}")
	public Certification getById(@PathVariable long id) throws CertificateNotFoundException {
		Certification c = service.selectOne(id);
		if(c==null) {
			logger.error("Certificate not found error at rest controller get by id");
			throw new CertificateNotFoundException();
		}
		logger.info("get by id from rest controller");
		return c;
	}
	
	@GetMapping("/getall")
	public List<Certification> getAll() {
		logger.info("get all from rest controller");
		return service.selectAll();
	}
	
	@GetMapping("/getbytitle/{title}")
	public Certification getByTitle(@PathVariable String title) {
		logger.info("get by title from rest controller");
		return service.findByTitle(title);
	}
	
	@PostMapping("/add")
	public Certification addCertification(@RequestBody @Valid Certification c){
		logger.info("add rest controller");
		return service.addCertificate(c); 
	}
	
	@PutMapping("/update/{id}")
	public Certification updateCertification(@RequestBody @Valid Certification c,@PathVariable long id) {
		logger.info("update by id from rest controller");
		return service.updateCertificate(c);
	}
	
	@DeleteMapping("/delete/{title}")
	public String deleteByTitle(@PathVariable String title) {
		logger.info("delete by id from rest controller");
		return service.deleteCertificateById(title);
	}
	
	@ResponseStatus(value = HttpStatus.FORBIDDEN,reason="Nope from Global Handler")
	@ExceptionHandler({CertificateNotFoundException.class})
	public void handler() {
		
	}
}
