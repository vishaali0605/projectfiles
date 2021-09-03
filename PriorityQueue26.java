package com.src1;

import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueue26 {

	public static void main(String[] args) {
		PriorityQueue pq=new PriorityQueue();
		pq.add(1);
		pq.add(8);
		pq.add(9);
		pq.add(10);
		System.out.println(pq);
		pq.offer(2);
		pq.offer(3);
		pq.offer(4);
		System.out.println(pq);
		Integer val=null;
		while( (val = (Integer) pq.poll()) != null) 
		{
			System.out.println(val);
		}
		

	}

}
