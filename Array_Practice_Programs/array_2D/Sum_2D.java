package com.array_2D;

import java.util.Scanner;

public class Sum_2D {

	public static void main(String[] args) {
		// Print the sum of elements of a multidimensional array
		Scanner nobi=new Scanner(System.in);
		System.err.print("enter the row size:");
		int rows=nobi.nextInt();
		System.err.print("enter the col size:");
		int cols=nobi.nextInt();
		int[][] arr=new int[rows][cols];
		System.err.println("enter the array elements:");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				arr[i][j]=nobi.nextInt();
			}
		}
		System.err.println("Input = ");
		for(int i=0;i<rows;i++) {
			for(int j=0; j<cols;j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		int sum=0;
		for(int i=0; i<rows; i++) {
			for(int j=0; j<cols;j++) {
				sum+=arr[i][j];
			}
		}
		System.out.println("Sum of the array is= " +sum);
		nobi.close();

}
}