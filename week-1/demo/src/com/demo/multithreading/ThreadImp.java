package com.demo.multithreading;

public class ThreadImp implements Runnable {

	public static void main(String[] args) {
		
		Runnable t1 = new ThreadImp();
		
		//object binding
		Thread td = new Thread(t1, "child");
		
		System.out.println(t1);
		System.out.println(td);
		
		td.start();
	}

	@Override
	public void run() {

		System.out.println("Run() is called");
	}

}
