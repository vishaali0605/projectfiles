package com.src1;

import java.util.ArrayList;

public class ArrayList8 {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();;
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		System.out.println(al);
		
		al.ensureCapacity(5);
		al.add(8);
		System.out.println(al);

	}

}
