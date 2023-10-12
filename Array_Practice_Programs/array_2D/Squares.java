package com.array_2D;

import java.util.Scanner;

public class Squares {

	public static void main(String[] args) {
		// Create an array with squares of the existing array elements
		Scanner nobi=new Scanner(System.in);
		System.err.print("enter the rows size:");
		int rows=nobi.nextInt();
		System.err.print("enter the cols size:");
		int cols=nobi.nextInt();
		int[][] arr=new int[rows][cols];
		System.err.println("enter the array elements:");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				arr[i][j]=nobi.nextInt();
			}
		}
		//squares
		int squares;
		System.err.println("Squares of the array= ");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				squares=arr[i][j]*arr[i][j];
				System.out.print(squares+ " ");
			}
			System.out.println();
		}
		nobi.close();
	}
}
