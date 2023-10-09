package com.loops;

import java.util.Scanner;

public class Whileloop {

	public static void main(String[] args) {
		// print 1 to 100 values 
		Scanner nobi=new Scanner(System.in);
		System.err.println("enter your starting range:");
		int n=nobi.nextInt();
		System.err.println("enter your ending range");
		int m=nobi.nextInt();
		while(n<=m) {
			System.out.println(n);
			n++;
		}
		nobi.close();

	}

}
