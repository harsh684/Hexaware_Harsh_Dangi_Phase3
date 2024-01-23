package com.hexaware.aop.service;

import org.springframework.stereotype.Service;

import com.hexaware.aop.exception.InsufficientFundsException;

@Service
public class BankService {
	
	
	public void login() {
		
		System.out.println("Login Sucessful...");
		
	}
	

	public void deposit() {
		System.out.println("Amount deposited succesfully...");
	}
	
	public void withdraw() {
		System.out.println("Amount withdrawn succesfully...");
	}
	
	public void fundTransfer() {
		System.out.println("Fund transfer succesful...");
	}
	
	public int checkBalance(int acno) throws InsufficientFundsException {
		int balance = 0;
		
		if(acno > 0) {
			balance = 50000;
		}else {
			throw new InsufficientFundsException();
		}
		return balance;
	}
}
