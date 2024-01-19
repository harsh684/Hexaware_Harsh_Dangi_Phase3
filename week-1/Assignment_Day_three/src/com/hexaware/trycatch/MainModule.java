package com.hexaware.trycatch;

import java.util.Scanner;

public class MainModule {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner sc = new Scanner(System.in);
			ThrowsException  t1 = new ThrowsException(); 
			t1.exe();
	
			System.out.println("After exception");
		}catch(UserDefinedException e) {
			e.printStackTrace();
		}finally {
			System.out.println("Finally block");
		}
	}
	
}
