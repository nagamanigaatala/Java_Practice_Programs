package com.array_1D;

import java.util.Scanner;

public class Avg {

	public static void main(String[] args) {
		// Print the average of the integers in an integer array
		Scanner nobi=new Scanner(System.in);
		System.err.println("enter your integer array range:");
		int n=nobi.nextInt();
		int[] arr=new int[n];
		System.err.println("enter your array integers:");
		int sum=0;
		for(int i:arr) {
			int a=nobi.nextInt();
			arr[i]=a;
			sum+=a;
		}
		System.out.println("Average=" + sum/n);
		nobi.close();
	}

}
