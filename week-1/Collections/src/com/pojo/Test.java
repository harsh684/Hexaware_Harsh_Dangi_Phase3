package com.pojo;

import java.util.Set;
import java.util.TreeSet;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1 = new Employee(101,"Harsh",100000);
		
		Employee emp2 = new Employee();
		
		emp2.setEname("Yellow");
		emp2.setEid(102);
		emp2.setSalary(20000);
		
		Set<Employee> set = new TreeSet<Employee>(new MyComparator());
		
		set.add(emp1);
		set.add(emp2);
		set.add(new Employee(103,"Nope",30000));
		
		System.out.println(set);
		
	}

}
