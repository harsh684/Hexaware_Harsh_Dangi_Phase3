package com.hexaware.collections;

import java.util.Comparator;

import com.hexaware.entity.OfficersPojo;

public class CustComparator implements Comparator<OfficersPojo> {

	@Override
	public int compare(OfficersPojo o1, OfficersPojo o2) {
		// TODO Auto-generated method stub
		String s1 = o1.toString();
		String s2 = o2.toString();
		return s1.compareTo(s2);
	}

}
