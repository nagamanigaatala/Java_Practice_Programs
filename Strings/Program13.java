package com.str;

import java.util.Scanner;

public class Program13 {

	public static void main(String[] args) {
		// given the first name and last name. print the last name first then followed by"," and first character of the first name
		
		Scanner nobi=new Scanner(System.in);
		System.err.println("enter the input1 String: ");
		String input1=nobi.nextLine();
		System.err.println("enter the input2 string: ");
		String input2=nobi.nextLine();
		
		String output =input2 + "," + input1.charAt(0);
		System.out.println("output= " + output);
		nobi.close();
	}

}
