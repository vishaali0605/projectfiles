//Factorial using recursive function
package com.src;

import java.util.Scanner;

public class FactorialNumber {
	public int factorial(int value) {
		if(value==0)
		{
			return 1;
		}
		else
		{
			return (value*factorial(value-1));
			
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		FactorialNumber fn=new FactorialNumber();
		System.out.println("enter a number");
		int value = sc.nextInt();
		int facto=1;
		facto=fn.factorial(value);
		System.out.println("The result is "+facto);
		
		}

	}

