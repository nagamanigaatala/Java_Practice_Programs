package com.loops;

import java.util.Scanner;

public class Forloop1 {

	public static void main(String[] args) {
		// print even numbers between any two numbers
		
		Scanner nobi=new Scanner(System.in);
		System.err.println("enter the starting range:");
		int n=nobi.nextInt();
		System.err.println("enter the ending range:");
		int m=nobi.nextInt();
		for(int i=1;i<=m;i++) {
			if(n<=m) {
				if(i%2==0) {
					System.out.println(i);
				}
			}
		}
		nobi.close();
	}

}
