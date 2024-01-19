package com.demo.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CompareClass implements Comparator<CompareClass>{

	String name;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CompareClass obj = new CompareClass();
		CompareClass obj2 = new CompareClass();
		
		List<CompareClass> l = new ArrayList<CompareClass>();
		obj.name = "Harsh";
		obj2.name = "Name";
		
		l.add(obj);
		l.add(obj2);
		
		SecondCompare s = new SecondCompare();
		
		Collections.sort(l,s);
		
		System.out.println(l);
	}

	@Override
	public int compare(CompareClass o1, CompareClass o2) {
		// TODO Auto-generated method stub
		return o1.name.compareTo(o2.name);
	}

}
class SecondCompare implements Comparator<CompareClass>{

	@Override
	public int compare(CompareClass o1, CompareClass o2) {
		// TODO Auto-generated method stub
		return o1.name.compareTo(o2.name);
	}
	
}
