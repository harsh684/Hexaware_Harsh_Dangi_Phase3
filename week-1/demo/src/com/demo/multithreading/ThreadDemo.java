package com.demo.multithreading;

public class ThreadDemo extends Thread {

	public static void main(String[] args) {//main thread created by jvm
		
		System.out.println("Welcome");
	
		ThreadDemo t1 = new ThreadDemo();
		
		System.out.println(t1);
		
		//start automatically calls run() method
		t1.start();
		
		for(int i=0;i<=5;i++) {
			System.out.println("Main thread");
		}
	}

	@Override
	public void run() {
		for(int i=0;i<=5;i++) {
			System.out.println("Child Thread");
		}
	}
}
