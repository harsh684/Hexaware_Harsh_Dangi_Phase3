package com.hexaware.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ArrayClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Number> list = new ArrayList<Number>();
		
		list.add(30); //new Integer(30)
		list.add(10);
		list.add(20);
		list.add(40);
		list.add(20);
		list.add(null);
		list.add(4.55);
		list.add(9988998L); //L for long
		list.add(3.99f);	//f for float 
		
		System.out.println(list);
		

		List<Number> linkedList = new LinkedList<Number>();
		
		linkedList.add(30); //new Integer(30)
		linkedList.add(10);
		linkedList.add(20);
		linkedList.add(40);
		linkedList.add(20);
		linkedList.add(null);
		linkedList.add(4.55);
		linkedList.add(9988998L); //L for long
		linkedList.add(3.99f);	//f for float
		
		System.out.println(linkedList);
		
		Iterator it = list.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		for(Number n : list) {
			System.out.println(n);
		}
		
		Object[] arr = list.toArray();
		
		System.out.println(arr);
		
		List<Integer> list3 = new ArrayList<Integer>();
		
		list3.add(30); //new Integer(30)
		list3.add(10);
		list3.add(20);
		list3.add(40);
		
		Collections.sort(list3);
		
		System.out.println(list3);
		
		int index = Collections.binarySearch(list3, 20);
		
		System.out.println(index);
	}

}
