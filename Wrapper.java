package com.src;

import java.util.Scanner;

public class Wrapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Wrapper wc = new Wrapper();

		if (args.length > 0) {
			int a = Integer.parseInt(args[0]);
			wc.prime(a);
			wc.evenodd(a);
			wc.palindrome(a);
			wc.amstrong(a);
			wc.perfect(a);
		} else {
			System.out.println("command line not found");
		}

	}
	public void perfect(long a) {
		int i = 1;
		long sum = 0;
		while (i <= a / 2) {
			if (a % i == 0) {
				sum = sum + i;
			}
			i++;
		}
		if (sum == a) {
			System.out.println("The number is a perfect number");
		} else {
			System.out.println("The number is not a perfect number");
		}

	}
	public void amstrong(int a) {
		int temp1, result = 0, rem1, sum1;
		temp1 = a;
		while (temp1 != 0) {
			rem1 = temp1 % 10;
			result += Math.pow(rem1, 3);
			temp1 = temp1 / 10;
		}

		if (result == a) {
			System.out.println("It is a amstrong number");
		} else {
			System.out.println("It is not a amstrong number");
		}

	}
	public void palindrome(int a) {
		int rem, temp, sum = 0;
		temp = a;
		while (a > 0) {
			rem = a % 10;
			sum = (sum * 10) + rem;
			a = a / 10;
		}
		if (temp == sum) {
			System.out.println("It is palindrome number");
		} else {
			System.out.println("It is not a palindrome number");
		}
	}
	public void evenodd(int a) {
		if (a % 2 == 0) {
			System.out.println("Even number");
		} else {
			System.out.println("Odd number");
		}
	}

	public void prime(int a) {
		boolean flag = false;
		for (int i = 2; i < a / 2; ++i) {
			if (a % i == 0) {
				flag = true;
				break;
			}
		}
		if (!flag) {
			System.out.println("It is a prime number");
		} else {
			System.out.println("It is not a prime number");
		}

	}

}
