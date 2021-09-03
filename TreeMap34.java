package com.src1;

import java.util.TreeMap;

public class TreeMap34 {

	public static void main(String[] args) {
	TreeMap tm=new TreeMap();
	tm.put(10, "Red");
	tm.put(20, "Green");
	tm.put(30, "Black");
	tm.put(5, "White");
	tm.put(50, "Pink");
	System.out.println(tm);
	System.out.println(tm.tailMap(5,false));
	}

}
