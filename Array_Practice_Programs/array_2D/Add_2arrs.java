package com.array_2D;

import java.util.Scanner;

public class Add_2arrs {

	public static void main(String[] args) {
		// Add the elements in an the an array and print it in the console
		Scanner nobi=new Scanner(System.in); 
		System.err.print("enter the arr row size=");
		int rows=nobi.nextInt();
		System.err.print("enter the arr col size=");
		int cols=nobi.nextInt();
		int[][] arr1=new int[rows][cols];
		System.err.println("enter the arr1 elements=");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols; j++) {
				arr1[i][j]=nobi.nextInt();
			}
		}
		int[][] arr2 =new int[rows][cols];
		System.err.println("enter the arr2 elements=");
		for(int i=0;i<rows;i++) {
			for(int j=0; j<cols;j++) {
				arr2[i][j]=nobi.nextInt();
			}
		}
		int[][] sum=new int[rows][cols];
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				sum[i][j]=arr1[i][j]+arr2[i][j];
			}
		}
		System.err.println("Output =");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				System.out.print(sum[i][j]+ " ");
			}
			System.out.println();
		}
		nobi.close();
	}
	

}
