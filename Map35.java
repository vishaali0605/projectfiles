package com.src1;

import java.util.TreeMap;

public class Map35 {

	public static void main(String[] args) {
		TreeMap tm=new TreeMap();
		tm.put(5, "dog");
		tm.put(63, "cat");
		tm.put(70, "rat");
		tm.put(12, "frog");
		tm.put(38, "eagle");
		tm.put(97, "lion");
		System.out.println(tm);
		System.out.println(tm.ceilingKey(30));
		System.out.println(tm.ceilingKey(63));
		System.out.println(tm.ceilingKey(100));

	}

}
