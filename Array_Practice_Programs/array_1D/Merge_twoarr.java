package com.array_1D;

import java.util.Arrays;
import java.util.Scanner;

public class Merge_twoarr {
	public static void main(String[] args) {
		// merge two arrays and print the output
		Scanner nobi=new Scanner(System.in);
		System.err.println("enter your 1st array elements size:");
		int n=nobi.nextInt();
		int[] arr1=new int[n];
		System.err.println("enter your 2nd array elements size:");
		int m=nobi.nextInt();
		int[] arr2=new int[m];
		
		System.err.println("enter your 1st array elements:");
			for(int i=0; i<n;i++ ) {
			arr1[i]=nobi.nextInt();
			}
		System.err.println("enter your 2nd array elements:");
			for(int i=0; i<m;i++) {
				arr2[i]=nobi.nextInt();		
			}
			System.out.println("input1:" + Arrays.toString(arr1));
			System.out.println("input2:" + Arrays.toString(arr2));
		 
	       int[] result=new int[n+m];
			for(int i=0; i<n;i++){
				result[i]= arr1[i];
			}
			for(int i=0;i<m;i++) {
				result[i+n]=arr2[i];
			}
			
			System.out.println("Merge elements are=" +  Arrays.toString(result));
			nobi.close();
	}
}