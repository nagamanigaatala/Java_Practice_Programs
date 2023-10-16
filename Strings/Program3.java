package com.str;

import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {
		// 3.Write a java program to count the total number of occurrences of a given character in a string
		Scanner nobi=new Scanner(System.in);
		System.err.println("enter the input string:");
		String input=nobi.nextLine();
		System.err.println("enter the target character:");
		char targetChar=nobi.next().charAt(0);
		System.out.println("Target char= " + targetChar);
		
		int count=0;
		for (int i = 0; i < input.length(); i++) {
			if(input.charAt(i)== targetChar)
				count++;
		}
		System.out.println("output: " + count);
		nobi.close();
	}

}
