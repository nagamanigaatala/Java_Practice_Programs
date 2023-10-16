package com.str;

import java.util.Scanner;

public class Program14 {

	public static void main(String[] args) {
		// 14. write a java program to print the filename extension in the console
		
		Scanner nobi=new Scanner(System.in);
		System.err.println("enter the input string: ");
		String input=nobi.nextLine();
		
		String outString ="";
		outString =input.substring(input.lastIndexOf(".")+ 1, input.length());
		System.out.println("output= " + outString);
		nobi.close();
	}

}
