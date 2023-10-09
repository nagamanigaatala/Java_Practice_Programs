package com.loops;

import java.util.Scanner;

public class Forloop4 {

	public static void main(String[] args) {
		// print odd numbers between any two numbers
		Scanner nobi=new Scanner(System.in);
		System.err.println("enter the starting range:");
		int n=nobi.nextInt();
		System.err.println("enter the ending range:");
		int m=nobi.nextInt();
		System.err.println("odd nummbers are=");
		for(int i=n; i<=m; i++) {
			if(n<=m) {
				if(i%2==1) {
					System.out.println(i);
				}
			}
		}
		nobi.close();
	}

}
