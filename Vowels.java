//2)write a program to accept character and check it is vowel or not 
package com.src;

import java.util.Scanner;

public class Vowels {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a character");
		char vowel=sc.next().charAt(0);
		System.out.println("The entered value is "+vowel);
		if(vowel=='a'||vowel=='e'||vowel=='i'||vowel=='o'||vowel=='u')
		{
			System.out.println("The given character is a vowel");
		}
		else
		{
			System.out.println( "The given character is not a vowel");
		}
		
		
	}

}
