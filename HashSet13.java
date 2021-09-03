package com.src1;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSet13 {

	public static void main(String[] args) {
		HashSet hs=new HashSet();
		hs.add("BMW");
		hs.add("Benz");
		hs.add("Audi");
		hs.add("Jaguar");
		hs.add("TATA");
		System.out.println(hs);
		ArrayList al =new ArrayList(hs);
		System.out.println(al);
	}

}
