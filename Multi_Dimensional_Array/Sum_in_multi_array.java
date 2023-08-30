package com.Arrays;

import java.util.Scanner;

public class Sum_in_multi_array {

	public static void main(String[] args) {
		//1.Print the sum of the elements of a multidimensional array
        Scanner nobi=new Scanner(System.in);
        int row_size, col_size;
        System.out.print("enter the Row array range:");
        row_size=nobi.nextInt();
        System.out.print("enter the col array range:");
        col_size=nobi.nextInt();
        int arr[][]=new int[row_size][col_size];
        int count=0;
        System.out.println("enter the array elements:");
        for (int i = 0; i < row_size; i++) {
            for (int j = 0; j < col_size; j++) {
                arr[i][j]=nobi.nextInt();
                }
        }
        for (int i = 0; i < row_size; i++) {
            for (int j = 0; j < col_size; j++) {
                count+=arr[i][j];
            }
        }
        System.out.println("total count of the given array is="+ count);
        nobi.close();
	}

}
