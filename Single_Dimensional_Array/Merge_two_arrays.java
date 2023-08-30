package com.Arrays;

import java.util.Scanner;

public class Merge_two_arrays {

	public static void main(String[] args) {
		  //Merge two arrays and print the
	       Scanner nobi=new Scanner(System.in);
	       int array1_size, array2_size;
	        String arr1[],arr2[],result[];
	        System.out.print("enter the array1 size:");
	        array1_size  =nobi.nextInt();
	        System.out.print("enter the array2 size:");
	        array2_size =nobi.nextInt();
	        arr1 =new String[array1_size];
	        arr2=new String[array2_size];
	        result=new String[array1_size+array2_size];
	        System.out.println("enter the st array elements:");
	        for (int i=0; i<array1_size; i++){
	            System.out.println("enter element"+(i+1));
	            arr1[i]=nobi.next();
	        }
	        System.out.println("enter the 2nd array elements:");
	        for(int i=0; i<array2_size; i++){
	            System.out.println("enter element"+(i+1));
	            arr2[i]=nobi.next();
	        }
	        for (int i=0; i<array1_size+array2_size; i++){
	            if(i<array1_size){
	                result[i]=arr1[i];
	            }else{
	                result[i]=arr2[i-array1_size];
	            }
	        }
	        System.out.println("merged array:");
	        for(int i=0; i<array1_size+array2_size; i++){
	            System.out.println(result[i]+" ");
	        }
	        nobi.close();
	}

}
