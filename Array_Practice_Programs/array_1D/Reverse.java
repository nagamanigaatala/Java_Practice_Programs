package com.array_1D;

import java.util.Arrays;
import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		// Reverse an array
		Scanner nobi=new Scanner(System.in);
		System.err.println("enter the array size:");
		int n=nobi.nextInt();
		int[] arr=new int[n];
		System.err.println("enter the array elements:");
		for(int i=0;i<n;i++) {
			arr[i]=nobi.nextInt();
		}
		System.out.println("intput:" + Arrays.toString(arr));
		//reverse
		System.err.println("Reverse the array:");
		for(int j=(n-1); j>=0;j--)
		System.out.print(arr[j]+" ");
		nobi.close();
	}

}
