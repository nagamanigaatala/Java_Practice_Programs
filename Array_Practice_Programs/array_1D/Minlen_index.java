package com.array_1D;

import java.util.Scanner;

public class Minlen_index {

	public static void main(String[] args) {
		// find the min length word from an array and print it along with its Index. 
		Scanner nobi=new Scanner(System.in);
		System.err.println("enter the array size:");
		int n=nobi.nextInt();
		int[] arr=new int[n];
		System.err.println("enter the array elements:");
		for(int i=0; i<n;i++) {
			arr[i]=nobi.nextInt();
		}
		//min length
		int min;
		int p=arr[0];
		for(int j=0; j<arr.length;j++) {
			min=arr[j];
			if(min<=p) {
				p=min;
			}
		}	
		System.out.println("Min length= " + p);
		//index
		for(int k=0;k<arr.length;k++) {
			if(arr[k]<=p) {
				System.out.println("index: "+ k);
			}
		}
		
		nobi.close();
	}

}
