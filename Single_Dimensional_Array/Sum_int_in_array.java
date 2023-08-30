package com.Arrays;

import java.util.Scanner;

public class Sum_int_in_array {

	public static void main(String[] args) {
		//print the sum of the integers in an integer array
		Scanner nobi=new Scanner(System.in);
		System.out.print("enter the array range:");
        int n =nobi.nextInt();
        int[] arr=new int[n];
        System.out.println("enter the array elements:");
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            int a=nobi.nextInt();
            arr[i]=a;
            count+=a;
        }
        System.out.println("total sum of the given array is="+count);
        nobi.close();
	}

}
