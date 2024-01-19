package com.demo.java8;

@FunctionalInterface
public interface MyFunctionalInterface {
	int add(int a, int b);
	
	default void show1() {
		System.out.println("Show 1 is default method");
	}
	static void show2() {
		System.out.println("Show 2 is static method");
	}
}
