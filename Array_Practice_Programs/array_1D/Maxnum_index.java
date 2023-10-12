package com.array_1D;

import java.util.Scanner;

public class Maxnum_index {

	public static void main(String[] args) {
		// Find the max number from an array and print it along with its index
		Scanner nobi=new Scanner(System.in);
		System.err.println("enter your array size:");
		int n=nobi.nextInt();
		int[] arr=new int[n];
		int max=0;
		System.err.println("enter the array elements:");
		for(int i=0; i<n;i++) {
			arr[i]=nobi.nextInt();
		}
		for(int  j=0;j<arr.length;j++) {
			if(arr[j]>max) {
				max=arr[j];
			}
		}
		System.out.println("max num="+max);
		for(int k=0; k<arr.length;k++) {
			if(arr[k]==max) {
				System.out.println("Index="+k);
			}
		}
		nobi.close();
   }
}
