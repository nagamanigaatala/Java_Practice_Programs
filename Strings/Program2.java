package com.str;

import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		// write a java program to count the number of words in a string
		Scanner nobi=new Scanner(System.in);
		System.err.println("enter the input string:");
		String input=nobi.nextLine();
		String[] words=input.split(" ");
		System.out.println("output: " + words.length);
		nobi.close();
	}

}
