package com.array_1D;

import java.util.Arrays;
import java.util.Scanner;

public class Str_reverse {

	public static void main(String[] args) {
		// Reverse the String array
		Scanner nobi=new Scanner(System.in);
		System.err.println("enter the array size:");
		int n=nobi.nextInt();
		String[] arr=new String[n];
		System.err.println("enter the array elements:");
		for(int i=0;i<n;i++) {
			arr[i]=nobi.next();
		}
		System.out.println("input:" + Arrays.toString(arr));
		//reverse string
		System.err.println("Reverse the string array:");
		for(int j=(n-1);j>=0;j--) {
			System.out.print(arr[j] + " ");
		}
		nobi.close();
	}
}