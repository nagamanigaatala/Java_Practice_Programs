package com.Switch;

import java.util.Scanner;

public class Even_odd {

	public static void main(String[] args) {
		// even or odd using switch
		
		Scanner nobi=new Scanner(System.in);
		System.err.println("enter your number:");
		int n=nobi.nextInt();
		int remainder = n%2;
		switch (remainder) {
		case 0:
			System.out.println("even");
			break;
		case 1:
			System.out.println("odd");
			break;
		}
		nobi.close();
	}

}
