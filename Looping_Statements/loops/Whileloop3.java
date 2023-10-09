package com.loops;

import java.util.Scanner;

public class Whileloop3 {

	public static void main(String[] args) {
		// print the prime numbers between range of two numbers
		
		Scanner nobi=new Scanner(System.in);
		System.err.println("enter the startingRange:");
		int n=nobi.nextInt();
		System.err.println("enter the endingRange:");
		int m=nobi.nextInt();
		System.out.println("prime numbers are=");
		for(int i=n; i<=m; i++) {
			if(i==1 || i ==0)
				continue;
			int flag =1;
			for(int j=2; j<=i/2; j++) {
				if(i%j==0) {
					flag=0;
					break;
				}
			}
			if(flag ==1)
				System.out.println(i);
		nobi.close();
		}
	}
}


