package com.src1;

import java.util.TreeSet;

public class TreeSet18 {

	public static void main(String[] args) {
		TreeSet ts=new TreeSet();
		ts.add(25);
		ts.add(74);
		ts.add(96);
		ts.add(67);
		ts.add(21);
		System.out.println(ts);
		System.out.println(ts.lower(70));
		System.out.println(ts.lower(1));
		System.out.println(ts.lower(100));
		
	}

}
