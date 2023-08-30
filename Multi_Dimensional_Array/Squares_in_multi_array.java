package com.Arrays;

import java.util.Scanner;

public class Squares_in_multi_array {

	public static void main(String[] args) {
		 //3.Create an array with SQUARES of the given array elements
        Scanner nobi=new Scanner(System.in);
        int rows, cols;
        System.out.print("enter the row size:");                
        rows=nobi.nextInt();
        System.out.print("enter the col size:");
        cols=nobi.nextInt();
        int[][] arr=new int[rows][cols];
        System.out.println("enter the array elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j]=nobi.nextInt();
            }
        } 
        int[][] Square =new int[rows][cols];
        for (int i = 0; i < rows; i++) {
             for (int j = 0; j < cols; j++) {
                Square[i][j]=arr[i][j]*arr[i][j];
             }
        }
        System.out.println("array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.println(arr[i][j]+" ");
            }
            System.out.println();
        } 
        System.out.println("Squares of the given array elements is=");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.println(Square[i][j]+" ");
            }
            System.out.println();
            nobi.close();
        }
	}

}
