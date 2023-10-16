package com.str;

import java.util.Arrays;
import java.util.Scanner;

public class Program10 {

	public static void main(String[] args) {
		// 10.Write a java program to create an array using words at odd positions in a string
		Scanner nobi=new Scanner(System.in);
		System.err.println("enter the input String: ");
		String input=nobi.nextLine();
		
		String[] words= input.split(" ");
		String[] outputArr= new String[words.length/2];
		int index =0;
		for(int i= 0; i< words.length; i++) {
			if(i%2 != 0) {
				outputArr[index] =words[i];
				index++;
			}
		}
		System.out.println("output: " + Arrays.toString(outputArr));
		nobi.close();
	}

}
