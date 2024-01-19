package com.hexaware;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set = new HashSet<String>();
		
		set.add("King");
		set.add("smith");
		set.add("adam");
		
		System.out.println(set);
		
		Set<Number> set2 = new HashSet<Number>();
		
		set2.add(34);
		set2.add(12);
		set2.add(56);
		
		System.out.println(set2);
		
		for (Number number : set2) {
			System.out.println(number);
		}
		
		Set<String> set3 = new TreeSet<String>();
		
		set3.add("B");
		set3.add("D");
		set3.add("A");
		set3.add("C");
		
		System.out.println(set3);
		
	}

}
