package com.src1;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSet15 {

	public static void main(String[] args) {
		Set s=new HashSet();
		s.add("Red");
		s.add("Yellow");
		s.add("Orange");
		s.add("White");
		s.add("Grey");
		System.out.println(s);
		Set s1=new TreeSet();
		s1.add("White");
		s1.add("Black");
		s1.add("Peach");
		s1.add("Grey");
		s1.add("Orange");
		System.out.println(s1);
		s1.retainAll(s);
		System.out.println(s1);
		s.retainAll(s1);
		System.out.println(s);
		

	}

}
