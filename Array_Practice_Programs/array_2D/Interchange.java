package com.array_2D;

import java.util.Scanner;

public class Interchange {

	public static void main(String[] args) {
		// Interchange the values of an array by transposing the index values
		Scanner nobi=new Scanner(System.in);
		System.err.print("enter the rows size:");
		int rows=nobi.nextInt();
		System.err.print("enter the cols size:");
		int cols =nobi.nextInt();
		int[][] arr=new int[rows][cols];
		System.err.println("enter the array elements:");
		for(int i=0; i<rows;i++) {
			for(int j=0;j<cols;j++) {
				arr[i][j]=nobi.nextInt();
			}
		}
		//interchange
		System.err.println("Interchange:");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[j][i]+ " ");
			}
			System.out.println();
		}
		nobi.close();
	}

}
