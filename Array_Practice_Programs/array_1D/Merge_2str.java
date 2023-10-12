package com.array_1D;

import java.util.Arrays;
import java.util.Scanner;

public class Merge_2str {

	public static void main(String[] args) {
		// merge two String arrays and print the output
		Scanner nobi=new Scanner(System.in);
		System.err.println("enter your array1 size:");
		int n=nobi.nextInt();
		String[] arr1=new String[n];
		System.err.println("enter your array2 size:");
		int m=nobi.nextInt();
		String[] arr2=new String[m];
		System.err.println("enter your arr1 elements:");
		for(int i=0; i<n;i++) {
			arr1[i]=nobi.next();
		}
		System.err.println("enteryour arr2 elements:");
		for(int i=0;i<m;i++) {
			arr2[i]=nobi.next();
		}
		
		//Merge
		String[] result=new String[n+m];
		for(int i=0;i<n;i++) {
			result[i]=arr1[i];
		}
		for(int i=0; i<m;i++) {
			result[i+n]=arr2[i];
		}
		
		System.out.println("merge elements are=" + Arrays.toString(result));
		nobi.close();
	}
}