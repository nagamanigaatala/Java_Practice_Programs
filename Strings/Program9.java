package com.str; 

import java.util.Scanner;

public class Program9 {

	public static void main(String[] args) {
		// 9. WAP to find the first repeated and non-repeated character in the given string
		
		Scanner nobi=new Scanner(System.in);
		System.err.println("enter the input string: ");
		String input=nobi.nextLine();
		
		char firstRepeatedChar =' ';
		char firstNonRepeatedChar=' ';
		
		for(int i=0; i<input.length();i++) {
			char tempChar =input.charAt(i);
			if(tempChar != ' ') {
				if(input.indexOf(tempChar)==input.lastIndexOf(tempChar))
				{
					if(firstNonRepeatedChar ==' ')
						firstNonRepeatedChar =tempChar;
				}
				else if(firstRepeatedChar == ' ')
					firstRepeatedChar =tempChar;
				if(firstNonRepeatedChar != ' ' && firstRepeatedChar != ' ')
				break;
			}
		}
		
		System.err.println("output: ");
		System.out.println("firstRepeatedChar: " +firstRepeatedChar);
		System.out.println("firstNonRepeatedChar: " + firstNonRepeatedChar);
		nobi.close();
	}

}
