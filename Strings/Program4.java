package com.str;

import java.util.Scanner;

public class Program4 {

	public static void main(String[] args) {
		// 4. write a java program to reverse a string
		Scanner nobi=new Scanner(System.in);
		System.err.println("enter the input string:");
		String input=nobi.nextLine();
		String rev="";
		for (int i = input.length()-1; i >=0; i--) {
			rev+=input.charAt(i);
		}
		System.out.println("Output= "+rev);
		nobi.close();
	
	}

}
