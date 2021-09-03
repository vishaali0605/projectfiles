package com.src1;

import java.util.TreeSet;

public class TreeSet20Correct {

	public static void main(String[] args) {
		TreeSet ts=new TreeSet();
		ts.add("Dog");
		ts.add("Cat");
		ts.add("Rat");
		ts.add("Bee");
		ts.add("Eal");
		System.out.println(ts);
		System.out.println(ts.pollLast());
		System.out.println(ts);
		

	}

}
