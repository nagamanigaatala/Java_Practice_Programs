package com.str;

import java.util.Scanner;

public class Program5 {

	public static void main(String[] args) {
		// write a java program to remove all starting and ending spaces from a string
		Scanner nobi=new Scanner(System.in);
		System.err.println("enter the input string:");
		String input=nobi.nextLine();
		System.out.println("output= " + input.trim());
		nobi.close();	}

}
