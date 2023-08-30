package com.Arrays;

import java.util.Scanner;

public class Avgnum_in_array {

	public static void main(String[] args) {
		 //print the average num in array
		 Scanner nobi =new Scanner(System.in);
		 System.out.print("enter the array range:");
	        int n=nobi.nextInt();
	        int[] arr=new int[n];
	        System.out.println("enter the array elements:");
	        int count=0;
	        for (int i = 0; i < arr.length; i++) {
	            int a=nobi.nextInt();
	            arr[i]=a;
	            count+=a;
	        }
	        System.out.println("Avarage of given array is =" + count/n);
	        nobi.close();
	        
	        
        //Another way to print the AVG num in the given array
        /*Scanner nobi=new Scanner(System.in);
        System.out.println("enter the array range:");
        int n=nobi.nextInt();
        int[] i=new int[n];
        System.out.println("enter the elements:");
        for (int j = 0; j < n; j++) {
           i[j]=nobi.nextInt();
            }
        double average = 0;
        for (int j = 0; j < n; j++) {
            average = average + i[j];
        }
            average =average/n;
            System.out.println("total average :"+average);
        nobi.close();*/
	}

}
