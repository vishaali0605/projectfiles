package com.src1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayList2 {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add("Dog");
		al.add("Cat");
		al.add("Fish");
		al.add("Frog");
		al.add("Bee");
		al.add("Rat");
		al.add("Lion");
		System.out.println(al);
		Iterator it=al.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("======================");
		ListIterator li=al.listIterator();
		while(li.hasNext())
		{
			System.out.println(li.next());
		}

	}

}
