package com.hexaware.aop.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import com.hexaware.aop.exception.InsufficientFundsException;

@Component
@Aspect
public class LoggingAspect {

	//this method will run before every bank service
	@Before("execution(* com.hexaware.aop.service.*.*())")
	public void beforeLogs() { //joint-point
		
		System.out.println("Logging before any bank service");
	}
	
	@After("execution(* com.hexaware.aop.service.BankService.fundTransfer())")
	public void afterLogs() { //joint-point
		
		System.out.println("Logging after fund transfer");
	}
	
//	@Around("execution(* com.hexaware.aop.service.BankService.fundTransfer())")
//	public void aroundLogs() { //joint-point
//		
//		System.out.println("Logging around fund transfer");
//	}
	
	@Pointcut("execution(* com.hexaware.aop.service.BankService.checkBalance(..))")
	public void afterReturningPointCut() { //point cut method we will use in joint point
		
	}
	
	//using above point cut
	@AfterReturning(pointcut = "afterReturningPointCut()",returning = "balance")
	public void afterReturningBalance(int balance) {//balance is proxy object
		System.out.println("Logs after returning balance amount "+balance);
	}
	
	@AfterThrowing( pointcut = " afterReturningPointCut()" , throwing = "e")
	public void   afterThrowingExp(InsufficientFundsException e) {
		
		System.out.println("Logs after throwing exp : "+e);
		
	}
}
