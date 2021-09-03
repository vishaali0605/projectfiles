package com.src1;

import java.util.HashSet;

public class HashSet11 {

	public static void main(String[] args) {
		HashSet hs=new HashSet();
		hs.add("vish");
		hs.add("narain");
		hs.add("thrisha");
		hs.add("anusha");
		System.out.println(hs);
		Object []arr=hs.toArray();
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		

	}

}
