package com.Practice;

import java.util.Scanner;

public class Even_odd {

	public static void main(String[] args) {
		Scanner nobi=new Scanner(System.in);
		System.out.println("enter the num:");
		int n=nobi.nextInt();
		if(n%2==0) {
			System.out.println("even num");
		}
		else {
			System.out.println("odd num");
		}
	}
}
