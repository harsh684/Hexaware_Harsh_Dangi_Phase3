package com.demo.multithreading;

public class MyThreads extends Thread{

	public static void main(String[] args) {

		MyThreads t1 = new MyThreads();
		
		t1.setPriority(MAX_PRIORITY);
		t1.setName("Child-1");
		
		System.out.println(t1);
		
		MyThreads t2 = new MyThreads();
		
		t2.setPriority(MAX_PRIORITY-2);
		t2.setName("Child-2");
		
		System.out.println(t2);
		
		t1.start();
		t2.start();
		
		System.out.println(t1.isAlive());
	}
	
	@Override
	public void run() {
		
		for(int i = 0;i <= 5;i++) {
			System.out.println(Thread.currentThread().getName());
		}
		
	}

}
