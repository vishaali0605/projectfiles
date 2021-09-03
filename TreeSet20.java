package com.src1;

import java.util.TreeSet;

public class TreeSet20 {

	public static void main(String[] args) {
		TreeSet ts=new TreeSet();
		ts.add("Pizza");
		ts.add("Burger");
		ts.add("Roti");
		ts.add("Brownie");
		ts.add("Panner gravey");
		System.out.println(ts);
		System.out.println(ts.pollFirst());
		System.out.println(ts);

	}

}
