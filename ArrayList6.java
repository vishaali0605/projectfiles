package com.src1;

import java.util.ArrayList;

public class ArrayList6 {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(5);
		al.add(65);
		al.add(78);
		al.add(88);
		System.out.println(al);
		if(al.isEmpty())
		{
			System.out.println("ArrayList is empty");
		}
		else
		{
			System.out.println("ArrayList is not empty");
		}
	}

}
