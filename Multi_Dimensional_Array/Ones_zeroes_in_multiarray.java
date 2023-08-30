package com.Arrays;

import java.util.Scanner;

public class Ones_zeroes_in_multiarray {

	public static void main(String[] args) {
		 //5.Create an array based on the mentioned conditions and print
        Scanner nobi=new Scanner(System.in);
        System.out.print("enter the rows size:");
        int rows=nobi.nextInt();
        System.out.print("enter the col size:");
        int col=nobi.nextInt();
        int[][] arr1=new int[rows][col];
        int[][] arr2=new int[rows][col];
        System.out.println("enter the array1 elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                arr1[i][j]=nobi.nextInt();
            }
        }
        System.out.println("enter the array2 elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                arr2[i][j]=nobi.nextInt();
            }
        }
        int[][] result=new int[rows][col];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
               if ( arr1[i][j]==arr2[i][j]) {
                    result[i][j]=1;
               }
               else{
                    result[i][j]=0;                
               }
            }
        }
       
        System.out.println("Result of the array is=");
        for(int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println(result[i][j]+" ");
            }
            System.out.println();
            nobi.close();
        }
	}

}
