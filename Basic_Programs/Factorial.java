package com.Practice;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner nobi=new Scanner(System.in);
		System.out.println("enter the num:");
		int n=nobi.nextInt();
		int i,fact=1;
		for(i=1; i<=n;i++) {
			fact=fact*i;
		}
		System.out.println("Factorial of "+n+" is: "+fact);
		nobi.close();
	}

}
