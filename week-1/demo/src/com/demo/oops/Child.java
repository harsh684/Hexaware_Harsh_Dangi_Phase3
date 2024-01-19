package com.demo.oops;

public class Child extends Parent {
	int cid = 99;
	
	public Child() {
		System.out.println("Child object created!!");
	}
	
	public void m2() {
		System.out.println("m2() called from child");
	}
	
	public void m1() {
		System.out.println("m1() method from child");
	}
	
	@Override
	public String toString() {
		return "Object id: "+this.cid;
	}
	
	public static void main(String[] args) {
		Child c = new Child();
	
		System.out.println(c);
		
		System.out.println(c.cid);
		
		c.m2();
	}
}
