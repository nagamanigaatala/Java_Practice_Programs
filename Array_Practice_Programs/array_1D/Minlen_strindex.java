package com.array_1D;

import java.util.Scanner;

public class Minlen_strindex {

	public static void main(String[] args) {
		// find the min length word from an array and print it along with its Index.
		// String
		Scanner nobi=new Scanner(System.in);
		System.err.println("enter the array size:");
		int n=nobi.nextInt();
		String[] arr=new String[n];
		System.err.println("enter the array elements:");
		for(int i=0;i<n;i++) {
			arr[i]=nobi.next();
		}
		//min length
		String min;
		String p=arr[0];
		for(int j=0;j<arr.length;j++) {
			min=arr[j];
			if(min.length()<=p.length()) {
				p=min;
			}
		}
		System.out.println("min length =" + p);
		//index
		int l= 0;
        while(l<arr.length) {
            min = arr[l];
            if(p.length() == min.length()){
                System.out.println("Index number is " + l);
            }
        l++;
		nobi.close();
	}

	}
}
