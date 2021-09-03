package com.src1;

import java.util.TreeSet;

public class TreeSet21 {

	public static void main(String[] args) {
		TreeSet ts=new TreeSet();
		ts.add(1);
		ts.add(5);
		ts.add(8);
		ts.add(3);
		ts.add(9);
		System.out.println(ts);
		System.out.println(ts.remove(2));
		System.out.println(ts.remove(5));
		System.out.println(ts);

	}

}
