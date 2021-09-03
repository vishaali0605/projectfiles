package com.src1;

import java.util.PriorityQueue;

public class PriorityQueue24 {

	public static void main(String[] args) {
		PriorityQueue pq=new PriorityQueue();
		pq.add("Good");
		pq.add("morning");
		pq.add("Have");
		pq.add("A");
		pq.add("nice");
		pq.add("day!!");
		System.out.println(pq);
		Object arr[]=pq.toArray();
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
		

	}

}
