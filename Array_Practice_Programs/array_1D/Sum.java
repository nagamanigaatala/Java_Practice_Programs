package com.array_1D;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		// print the sum of the integers in an integer array
		Scanner nobi=new Scanner(System.in);
		System.err.println("enter your array integers size:");
		int n=nobi.nextInt();
		int[] arr=new int[n];
		System.err.println("enter your array integers:");
		int sum=0;
		for(int i:arr) { //using foreach loop
			int a=nobi.nextInt();
			arr[i]=a;
			sum+=a;	
		}
		System.out.println("total sum=" +sum);
		nobi.close();
	}
}
