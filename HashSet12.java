package com.src1;

import java.util.HashSet;
import java.util.TreeSet;

public class HashSet12 {

	public static void main(String[] args) {
		HashSet hs=new HashSet();
		hs.add("Fish");
		hs.add("Octopus");
		hs.add("Dragon Fly");
		hs.add("Bee");
		System.out.println(hs);
		TreeSet ts=new TreeSet(hs);
		System.out.println(ts);
	}

}
