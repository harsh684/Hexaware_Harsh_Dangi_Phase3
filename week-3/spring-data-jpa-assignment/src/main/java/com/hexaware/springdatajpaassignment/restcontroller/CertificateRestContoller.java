package com.hexaware.springdatajpaassignment.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.springdatajpaassignment.entity.Certification;
import com.hexaware.springdatajpaassignment.service.ICertificationService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/certification")
public class CertificateRestContoller {

	@Autowired
	ICertificationService service;
	
	@GetMapping("/get/{id}")
	public Certification getById(@PathVariable long id) {
		return service.selectOne(id);
	}
	
	@GetMapping("/getall")
	public List<Certification> getAll() {
		return service.selectAll();
	}
	
	@GetMapping("/getbytitle/{title}")
	public Certification getByTitle(@PathVariable String title) {
		return service.findByTitle(title);
	}
	
	@PostMapping("/add")
	public Certification addCertification(@RequestBody @Valid Certification c){
		return service.addCertificate(c); 
	}
	
	@PutMapping("/update/{id}")
	public Certification updateCertification(@RequestBody @Valid Certification c,@PathVariable long id) {
		return service.updateCertificate(c);
	}
	
	@DeleteMapping("/delete/{title}")
	public String deleteByTitle(@PathVariable String title) {
		return service.deleteCertificateById(title);
	}
}
