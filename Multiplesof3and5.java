package com.src;

import java.util.Scanner;
import java.util.function.IntFunction;

class Multiples {
	public void display(int num) {
		if (num % 3 == 0 && num % 5 == 0) {
			System.out.println("FizzBuzz");
		} else if (num % 3 == 0) {
			System.out.println("Fizz");
		} else if (num % 5 == 0) {
			System.out.println("Buzz");
		} else {
			System.out.println(num);
		}
	}
}

public class Multiplesof3and5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		IntFunction in=(o1)->{
			Multiples m=new Multiples();
			m.display(o1);
			return o1;
	};
	System.out.println("Enter the number");
	int n=sc.nextInt();
   in.apply(n);

}
}
