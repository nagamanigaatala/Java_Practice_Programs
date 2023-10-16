package com.str;

import java.util.Scanner;

public class Program12 {

	public static void main(String[] args) {
		// 12.Compare two strings. if the characters in string 1 are present in string2 . then it should be printed as such in output, else '+' should be printed in output.
		//ignore case different
		Scanner nobi=new Scanner(System.in);
		System.err.println("enter the input1 string: ");
		String input1=nobi.nextLine();
		System.err.println("enter the input2 string: ");
		String input2=nobi.nextLine();
		
		String output="";
		for (int i = 0; i < input1.length(); i++) {
			char tempChar =input1.toLowerCase().charAt(i);
			if(input2.toLowerCase().indexOf(tempChar) >=0)
				output+=input1.charAt(i);
			else
				output += '+';
		}
		System.out.println("output = " + output);
		nobi.close();
	}

}
