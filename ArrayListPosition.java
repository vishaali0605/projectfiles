package com.src1;

import java.util.ArrayList;

public class ArrayListPosition {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add("vishaali");
		al.add("Baskar");
		al.add("Parasakthi");
		al.add("Thrisha");
		al.add("Narain");
		System.out.println(al);
		al.add(0, "Sukirthan");
		System.out.println(al);

	}

}
