package com.loops;

import java.util.Scanner;

public class Whileloop1 {

	public static void main(String[] args) {
		// print even numbers between any two numbers
		Scanner nobi=new Scanner(System.in);
		System.err.println("enter your starting range:");
		int n=nobi.nextInt();
		System.err.println("enter your ending range:");
		int m=nobi.nextInt();
		while(n<=m) {
			if(n%2==0) {
				System.out.println(n+ "even num");
			}
			n++;
		}
		
		nobi.close();
	}

}
