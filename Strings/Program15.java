package com.str;

import java.util.Scanner;

public class Program15 {

	public static void main(String[] args) {
		// write a java program to verify whether the given string is palindrome or not
		
		Scanner nobi=new Scanner(System.in);
		System.err.println("enter the input string: ");
		String input=nobi.nextLine();
	
		String outputStr= "";
		if(getReverseString(input).equals(input))
			outputStr ="it's a palindrome";
		else
			outputStr ="it's not a palindrome";
		
		System.out.println("output= " + outputStr);
		nobi.close();
		
	}
		
		private static String getReverseString(String input) {
			String rev=" ";
			for(int j=input.length()-1;j>=0;j--) {
				rev +=input.charAt(j);
			}
			return rev;
	}

}
