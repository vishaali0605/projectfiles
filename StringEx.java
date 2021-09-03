package com.src1;

public class StringEx {

	public static void main(String[] args) {
		 String myStr = "The quick brown fox jumps over the lazy dog.";
		    for(char i='a';i<='z';i++)
		    {
		    	System.out.print(i+"-");
		    	System.out.print(myStr.lastIndexOf(i));
		    	System.out.print(" ");
		    }
		   

	}

}
