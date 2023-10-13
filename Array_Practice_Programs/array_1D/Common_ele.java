package com.array_1D;

import java.util.Arrays;
import java.util.Scanner;

public class Common_ele {

	public static void main(String[] args) {
		// common elements
		int[] arr1=new int[5];
		Scanner nobi=new Scanner(System.in);
		System.err.println("enter the arr1 elements:");
		for(int i=0;i<5;i++) {
			arr1[i]=nobi.nextInt();
		}
		System.out.println("Input= "+ Arrays.toString(arr1));
		int[] arr2=new int[5];
		System.err.println("enter the arr2 elements:");
		for(int i=0;i<5;i++) {
			arr2[i]=nobi.nextInt();
		}
		System.out.println("Input= "+ Arrays.toString(arr2));
		//common elements
		System.err.println("common elements= ");
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				if(arr1[i]==arr2[j])
					System.out.println(arr1[i]+" ");
			}
		}
		nobi.close();
	}

}
