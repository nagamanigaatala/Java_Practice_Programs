package com.str;

import java.util.Scanner;

public class Program8 {

	public static void main(String[] args) {
		// 8. Write a java program to find the count of uppercase letters, digits and special character in a given string
			Scanner nobi=new Scanner(System.in);
			System.err.println("enter the input string:");
			String input=nobi.nextLine();
			int upperCareLetterCount =0;
			int lowerCaseLetterCount =0;
			int digitsCount = 0;
			int specialCharaterCount=0;
			
			char[] characters= input.toCharArray();
			for (char ch : characters) {
				if(Character.isUpperCase(ch)) {
					upperCareLetterCount++;
				}
				else if(Character.isLowerCase(ch))
					lowerCaseLetterCount++;
				else if(Character.isDigit(ch))
					digitsCount++;
				else
					specialCharaterCount++;	
			}
			
			System.err.println("output: ");
			System.out.println("upperCareLetterCount: " +upperCareLetterCount);
			System.out.println("lowerCaseLetterCount: " + lowerCaseLetterCount);
			System.out.println("digitsCount: " +digitsCount);
			System.out.println("specialCharaterCount: " + specialCharaterCount);
			nobi.close();
	
	}

}






