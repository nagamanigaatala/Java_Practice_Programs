package com.loops;

import java.util.Scanner;

public class Whileloop5 {

	public static void main(String[] args) {
		// reverse the numbers
		Scanner nobi=new Scanner(System.in);
		System.err.println("enter the starting rage:");
		int n=nobi.nextInt();
		System.err.println("enter the ending range");
		int m=nobi.nextInt();
		int rev=0;
		while() {
			if(n!=0) {
				int rem = n%10;
				rev=rev*10+rem;
				rev=n/10;
				
			}
			System.out.println(rev);
			                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       ;
		}
		nobi.close();
	}

}
