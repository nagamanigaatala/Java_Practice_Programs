package com.array_2D;

import java.util.Scanner;

public class Duplicate_array {

	public static void main(String[] args) {
		// print the duplicate elements between two arrays
		Scanner nobi=new Scanner(System.in);
		System.err.print("enter the rows size:");
		int rows=nobi.nextInt();
		System.err.print("enter the cols size:");
		int cols=nobi.nextInt();
		int[][] arr1=new int[rows][cols];
		System.err.println("enter the arr1 elements:");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				arr1[i][j]=nobi.nextInt();
			}
		}
		int[][] arr2=new int[rows][cols];
		System.err.println("enter the arr2 elements:");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				arr2[i][j]=nobi.nextInt();
			}
		}
		System.err.println("Common elements= ");
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr2.length;j++) {
				if(arr1[i][j]==arr2[i][j]) 
					System.out.print(arr1[i][j]+" ");
			}
		}
		nobi.close();
	}

}
