package com.demo.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class OperationsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(30); //new Integer(30)
		list.add(10);
		list.add(20);
		list.add(40);
		
		Stream<Integer> stream = list.stream();
		
		//will only show first 3 elements
		//stream.limit(3).forEach(System.out::println);
		
		//will skip first 3 elements/objects
		//stream.skip(3).forEach(System.out::println);
	
		//we will get all distinct value
		//stream.distinct().forEach(System.out::println);
	
		//will return sum of all numbers or 0
		Integer result = stream.reduce((a,b)->{return a+b;}).orElse(0);
		
		System.out.println(result);
	}

}
