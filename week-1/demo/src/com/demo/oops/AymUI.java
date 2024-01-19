package com.demo.oops;

import java.util.Scanner;

public class AymUI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		System.out.println("****WELCOME****");
		Scanner scanner = new Scanner(System.in);
		
		//interface object
		//recommended
		IBank obj = new BankImpl2();
		boolean flag = true;
		while(flag) {
			System.out.println("1. Deposit \n2. Withdraw \n3. Exit");
			n=scanner.nextInt();
			switch(n) {
			
			case 1:obj.withdraw();
			break;
			
			case 2:obj.deposit();
			break;
			
			case 3:flag = false;
				break;
			}
		}
	}

}
