package com.Arrays;

import java.util.Scanner;

public class Addele_in_mutli_array {

	public static void main(String[] args) {
		 //2. Add the elements in an array and print
        Scanner nobi=new Scanner(System.in);
        int row,col;        
        System.out.print("enter the num of rows:");
        row=nobi.nextInt();
        System.out.print("enter the num of col:");
        col=nobi.nextInt();
        int[][] arr1=new int[row][col];
        int[][] arr2=new int[row][col];
        int[][] sum=new int[row][col];
        System.out.println("enter the first array:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr1[i][j]=nobi.nextInt();
                }
        }
        System.out.println("enter the second array:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr2[i][j]=nobi.nextInt();
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                sum[i][j] =arr2[i][j] + arr1[i][j];              
            }
        }
        System.out.println("adding the two arrays is=");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println(sum[i][j]+" ");
            }
            System.out.println();
            nobi.close();
	}
	}

}
