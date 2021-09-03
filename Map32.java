package com.src1;

import java.util.TreeMap;

public class Map32 {

	public static void main(String[] args) {
		TreeMap tm=new TreeMap();
		tm.put(6, "hello");
		tm.put(7, "welcome");
		tm.put(8, "to");
		tm.put(9, "this");
		tm.put(10, "session");
		System.out.println(tm);
		
		System.out.println(tm.subMap(7, 9));
	}

}
