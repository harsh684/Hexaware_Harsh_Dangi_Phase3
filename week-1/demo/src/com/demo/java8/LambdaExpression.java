package com.demo.java8;

import java.util.function.Function;

public class LambdaExpression {

	public static void main(String[] args) {
		
		MyFunctionalInterface mi =	(int a,int b)->{
			return a+b;
		};
		System.out.println(mi.add(5, 5));
		
		Function<String, Integer> intConverter = Integer::parseInt;
	
		System.out.println(intConverter.apply("500"));
		
		
	}


}
