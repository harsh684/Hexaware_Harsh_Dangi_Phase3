package com.demo.practice;

import java.util.*;

public class Iteratorss  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> l = new TreeSet<String>();
		l.add("BMW");
		l.add("Mercedes");
		l.add("Porsche");
		
		Iterator it = l.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		Map<Integer,String> map = new TreeMap<Integer,String>();
		
		map.put(1,"Harsh");
		map.put(2,"Krishna");
		map.put(3,"Shiva");
		
		for (var entry : map.entrySet()) {
		    System.out.println(entry.getKey() + ": " + entry.getValue());
		}
	}

}
