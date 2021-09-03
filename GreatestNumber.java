//3)write a program to accept three number and check greatest and least among them
package com.src;

import java.util.Scanner;

public class GreatestNumber {
	public int greater(int num1, int num2, int num3) {
		if (num1 > num2 && num1 > num3) {
			return num1;
		} else if (num2 > num1 && num2 > num3) {
			return num2;
		} else {
			return num3;
		}

	}
	public int smaller(int num1, int num2, int num3) {
		if (num1 < num2 && num1 < num3) {
			return num1;
		} else if (num2 < num1 && num2 < num3) {
			return num2;
		} else {
			return num3;
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		GreatestNumber gn = new GreatestNumber();
		System.out.println("Enter the first number");
		int num1 = sc.nextInt();
		System.out.println("Enter the second number");
		int num2 = sc.nextInt();
		System.out.println("Enter the third number");
		int num3 = sc.nextInt();
		System.out.println(
				"The first number is " + num1 +"\n"+ "The second number is " + num2 +"\n"+ "The third number is " + num3+"\n");
		System.out.println("The greatest number is "+gn.greater(num1, num2, num3));
		System.out.println("The least number is "+gn.smaller(num1, num2, num3));

	}

}
