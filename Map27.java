package com.src1;

import java.util.HashMap;

public class Map27 {

	public static void main(String[] args) {
		HashMap<Integer,String>hm=new HashMap<Integer,String>();
		hm.put(6, "vishaali");
		hm.put(7, "baskar");
		hm.put(8, "parasakthi");
		hm.put(9, "thrisha");
		hm.put(5, "narain");
		System.out.println(hm);
		if(hm.containsValue("vishaali"))
		{
			System.out.println("It contains the values");
		}
		else
		{
			System.out.println("It does not contains values");
		}
		if(hm.containsKey(10))
		{
			System.out.println("It contains the key");
		}
		else
		{
			System.out.println("It does not contain key");
		}

	}

}
