package com.str;

import java.util.Scanner;

public class Program7 {

	public static void main(String[] args) {
		// 7. write a java program to modify the string in the following pattern
		  
		 //change odd words to uppercase and reverse the even words
		 Scanner nobi=new Scanner(System.in);
		 System.err.println("enter the input string:");
		 String input=nobi.nextLine();
		 String[] words=input.split(" ");
		 String output=" ";
		 for (int i = 0; i < words.length; i++) {
			String word=words[i];
			
			if(i%2==0)
				output +=word.toUpperCase();
			else
				output +=getReverseString(word);
			if(i !=words.length-1)
				output +=" ";
		}
		 System.out.println("output= " + output);
		 nobi.close();
	}

	private static String getReverseString(String input) {
		String rev=" ";
		for(int j=input.length()-1;j>=0;j--) {
			rev +=input.charAt(j);
		}
		return rev;
	}

}
