package com.demo.java8;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTimeDemos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate l = LocalDate.now();
		LocalDate lw = LocalDate.of(2023,12,31);
		System.out.println(l);
		
		System.out.println(l.isLeapYear());
		
		System.out.println(l.isBefore(lw));
		
		System.out.println(l.plusYears(20));
		
		System.out.println(l.minusYears(20));
		
		System.out.println(l.withYear(2029));
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		
		String str2 = "12-01-2024";
		
		LocalDate date = LocalDate.parse(str2,formatter);
		
		System.out.println(date);
		
		String date2 = date.format(formatter);
		
		System.out.println(date2);
		
		System.out.println(date.getYear());
		
		System.out.println(date.getDayOfYear());
	}

}
