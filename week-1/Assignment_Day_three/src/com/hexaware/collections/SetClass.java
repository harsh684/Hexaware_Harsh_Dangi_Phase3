package com.hexaware.collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import com.hexaware.entity.OfficersPojo;

public class SetClass {

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
		
		Set<OfficersPojo> set3 = new TreeSet<OfficersPojo>(new CustComparator());
		
		set3.add(new OfficersPojo(1, "John", "Doe", "B123", "123-456-7890", 101));
		set3.add(new OfficersPojo(2, "Jane", "Smith", "B456", "987-654-3210", 102));
		
		System.out.println(set3);
	}

}
