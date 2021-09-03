package com.src1;

import java.util.ArrayList;

public class ArrayList7 {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(85);
		al.add(41);
		al.add(69);
		al.add(25);
		al.add(12);
		System.out.println(al);
		al.trimToSize();
		System.out.println(al);
	}

}
