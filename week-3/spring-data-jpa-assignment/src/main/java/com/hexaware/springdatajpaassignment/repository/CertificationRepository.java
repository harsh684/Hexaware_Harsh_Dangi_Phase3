package com.hexaware.springdatajpaassignment.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hexaware.springdatajpaassignment.entity.Certification;

@Repository
public interface CertificationRepository extends JpaRepository<Certification, Long>{

	public Certification findByTitle(String title);
	
	@Modifying
	@Query("delete from Certification c where c.title = ?1")
	public int deleteCertificateByTitle(String title);
}
