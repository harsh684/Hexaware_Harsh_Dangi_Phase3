package com.hexaware.springdatajpaassignment.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ResponseStatus(value = HttpStatus.FORBIDDEN,reason="Nope from Global Handler")
	@ExceptionHandler({CertificateNotFoundException.class})
	public void handler() {
		
	}
	
}
