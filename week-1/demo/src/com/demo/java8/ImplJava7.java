package com.demo.java8;

public class ImplJava7 implements MyFunctionalInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFunctionalInterface mi = new ImplJava7();
		System.out.println(mi.add(5, 5));
	
		//static method in interface
		MyFunctionalInterface.show2();
		
		//default method in interface
		mi.show1();
	}

	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}

}
