package com.str;

import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		// 1. write a java program to count the number of character in string
		Scanner nobi=new Scanner(System.in);
		System.err.println("enter your iput string:");
		String input=nobi.nextLine();
		System.out.println("output: " +input.length());
		nobi.close();
	}


}
