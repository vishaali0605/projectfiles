package com.src1;

import java.util.ArrayList;

public class ArrayList10 {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add("BMW");
		al.add("Benz");
		al.add("Audi");
		al.add("Suzuki");
		al.add("TATA");
		System.out.println(al);
		int size=al.size();
		for(int i=0;i<size;i++)
		{
			System.out.println(al.get(i));
		}
		

	}

}
