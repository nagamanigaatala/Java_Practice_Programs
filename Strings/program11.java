package com.str;

import java.util.Scanner;

public class program11 {

	public static void main(String[] args) {
		// 11. write a java program to find the max length-word in a given string (if two words are of same length then return the first occurring word of max-length)
		
		Scanner nobi=new Scanner(System.in);
		System.err.println("enter the input string: ");
		String input=nobi.nextLine();
		
		String[] words=input.split(" ");
		String maxLenWord = words[0];
		
		for(int i=1; i<words.length; i++) {
			if(maxLenWord.length() < words[i].length())
				maxLenWord = words[i];
		}
		System.out.println("output: " + maxLenWord);
		nobi.close();
	}
}
