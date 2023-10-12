package com.array_2D;
	
import java.util.Scanner;

public class One_zero {

	public static void main(String[] args) {
		// Create an array based on the mentioned conditions and print it in the console
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
		int[][] result=new int[rows][cols];
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				if(arr1[i][j]==arr2[i][j]) {
					result[i][j]=1;
				}
				else
					result[i][j]=0;
			}
		}
		//result
		System.err.println("output:");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				System.out.print(result[i][j]+ " ");
			}
			System.out.println();
		}
		nobi.close();
	}
		
}
