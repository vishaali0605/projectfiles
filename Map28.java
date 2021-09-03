package com.src1;

import java.util.HashMap;
import java.util.Set;

public class Map28 {

	public static void main(String[] args) {
		HashMap hm=new HashMap();
		hm.put(8, "red");
		hm.put(1, "blue");
		hm.put(5, "green");
		hm.put(9, "yellow");
		hm.put(3, "orange");
		System.out.println(hm);
		Set s=hm.keySet();
		System.out.println(s);
		Set s1=hm.entrySet();
		System.out.println(s1);

	}

}
