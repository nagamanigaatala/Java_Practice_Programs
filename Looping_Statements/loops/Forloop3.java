package com.loops;

import java.util.Scanner;

public class Forloop3 {

	public static void main(String[] args) {
		// print the prime numbers between range of two numbers
		Scanner nobi=new Scanner(System.in);
		System.err.println("enter the starting range:");
		int n=nobi.nextInt();
		System.err.println("enter the ending range:");
		int m=nobi.nextInt();
		int count=0, i=2;
		for(i=1;i<=n/2;i++) {
			if(n<=m) {
				if(n%i==0) {
					count++;
					break;
				}
			}
			
		}
		if(count ==0) {
			System.out.println(n+"prime");
		}
		n++;
		nobi.close();
	}

}
