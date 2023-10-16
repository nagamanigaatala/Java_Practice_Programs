package com.str;

import java.util.Scanner;

public class Program6 {

	public static void main(String[] args) {
		// 6. write a java program to reverse "each word" of a given string
		Scanner nobi=new Scanner(System.in);
		System.err.println("enter the input string:");
		String input=nobi.nextLine();
		String[] words=input.split(" ");
		String output="";
		for (int i = 0; i < words.length; i++) {
			String word = words[i];
			String rev=" ";
		for (int j = word.length()-1; j>=0; j--) {
			rev+= word.charAt(j);
			}
		output+=rev;
		}
		System.out.println("output: "+ output);
		nobi.close();
	}
}