package com.pojo;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> map = new LinkedHashMap<Integer,String>();
		
		map.put(103, "ram");
		map.put(102, "smith");
		map.put(101, "joe");
		map.put(102, "sai");
		
		System.out.println(map);
		
		Set<Integer> set = map.keySet();
		
		Iterator<Integer> it = set.iterator();
		
		while(it.hasNext()) {
			Integer k =it.next();
			System.out.println(k+ map.get(k));
		}
			
		Collection<String> c = map.values();
		
		for (String string : c) {
			System.out.println(string);
		}
		
Employee emp1 = new Employee(101,"Harsh",100000);
		
		Employee emp2 = new Employee();
		
		emp2.setEname("Yellow");
		emp2.setEid(102);
		emp2.setSalary(20000);
		
		Map<Employee,String> map2 = new TreeMap<Employee,String>(new MyComparator());
		
		map2.put(emp1,"Pune");
		map2.put(emp2,"Hyderabad");
		map2.put(new Employee(103,"Nope",30000),"Rudrapur");
		
		System.out.println(map2);
	}

}
