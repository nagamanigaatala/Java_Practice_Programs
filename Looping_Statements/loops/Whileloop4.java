package com.loops;

import java.util.Scanner;

public class Whileloop4 {

	public static void main(String[] args) {
		// print odd numbers between any two numbers
	Scanner nobi=new Scanner(System.in);
	System.err.println("enter the starting range:");
	int n=nobi.nextInt();
	System.err.println("enter the ending range:");
	int m =nobi.nextInt();
	while(n<=m) {
		if(n%2==1) {
			System.out.println(n);
		}
		n++;
	}
	nobi.close();
	}

}
