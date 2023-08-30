package com.Arrays;

import java.util.Scanner;

public class Reverse_string_in_array {

	public static void main(String[] args) {
		 //Reverse the array
        Scanner nobi=new Scanner(System.in);
        System.out.print("enter the size of array:");
        int n =nobi.nextInt();
        String[] arr=new String[n];
        System.out.println("enter elements for the array:");
        for(int i=0; i<n; i++)
            arr[i]=nobi.next();
        System.out.println("\nReverse of given array is:");
        for(int i=(n-1); i>=0;i--)
            System.out.print(arr[i]+" ");
        nobi.close();

	}

}
