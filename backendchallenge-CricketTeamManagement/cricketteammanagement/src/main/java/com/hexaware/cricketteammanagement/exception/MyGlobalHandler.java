package com.hexaware.cricketteammanagement.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class MyGlobalHandler {

	@ExceptionHandler(Exception.class)
	public ResponseEntity<String> handleAllException(Exception e) {
		return new ResponseEntity<>(e.toString(),HttpStatus.EXPECTATION_FAILED);
	}
}
