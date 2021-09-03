package com.src1;

import java.util.HashSet;

public class HashSet14 {

	public static void main(String[] args) {
		HashSet hs=new HashSet();
		HashSet hs1=new HashSet();
		hs.add(1);
		hs.add(2);
		hs.add(6);
		System.out.println(hs);
		hs1.add(1);
		hs1.add(2);
		hs1.add(6);
		System.out.println(hs1);
		if(hs.equals(hs1)) {
			System.out.println(hs+" equals "+hs1);
		}
		else
		{
			System.out.println("It does not equals");
		}
		

	}

}
