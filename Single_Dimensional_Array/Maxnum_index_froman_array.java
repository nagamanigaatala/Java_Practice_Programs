package com.Arrays;

import java.util.Scanner;

public class Maxnum_index_froman_array {

	public static void main(String[] args) {
		//Find the max num from an array and print it along with it's index.
		Scanner nobi=new Scanner(System.in);
		System.out.print("enter the array range:");
	    int n=nobi.nextInt();
	    int[] arr=new int[n];
	    System.out.println("enter the array elements:");
	    int max=0;
	    for (int i = 0; i < n; i++) {
	        arr[i]=nobi.nextInt();
	    }
	    for (int j= 0; j < arr.length; j++) {
	        if (arr[j]>max) {
	            max=arr[j];
	        }
	    }
	    System.out.println("max num is" + max);
	        for (int k = 0; k < arr.length; k++) {
	            if (arr[k]==max) {
	                System.out.println("Index num is" + k);
	        }
	    }
	        nobi.close();
	}

}
