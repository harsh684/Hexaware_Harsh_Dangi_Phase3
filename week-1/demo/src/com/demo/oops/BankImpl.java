package com.demo.oops;

public abstract class BankImpl implements IBank {

	@Override
	public void deposit() {
		// TODO Auto-generated method stub
		System.out.println("Deposit success");
	}

	public abstract void withdraw();
	
}
