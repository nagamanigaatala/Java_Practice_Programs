package com.loops;

import java.util.Scanner;

public class Whileloop2 {

	public static void main(String[] args) {
		// print the number which are divisible by number for the range of two numbers
		Scanner nobi=new Scanner(System.in);
		System.err.println("enter your starting range:");
		int n=nobi.nextInt();
		System.err.println("enter your ending range:");
		int m=nobi.nextInt();
		System.err.print("enter the divisible number:");
		int divNum=nobi.nextInt();
		while(n<=m) {
			if(n%divNum==0) {
				System.out.println(n);
			}
			n++;
		}
		nobi.close();
	}

}
