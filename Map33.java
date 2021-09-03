package com.src1;

import java.util.TreeMap;

public class Map33 {

	public static void main(String[] args) {
		TreeMap tm=new TreeMap();
		tm.put(5,"chocolate");
		tm.put(6,"biscuit");
		tm.put(7,"candy");
		tm.put(8,"chips");
		tm.put(9,"cake");
		System.out.println(tm);
		System.out.println(tm.tailMap(8));
	}

}
