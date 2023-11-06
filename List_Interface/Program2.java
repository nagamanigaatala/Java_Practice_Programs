package com.listinterfaces_assignment;

import java.util.ArrayList;
import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		// 2. WAP to print the sum of the even number in a list
		Scanner nobi=new Scanner(System.in);
		System.err.print("enter the input size: ");
		int n=nobi.nextInt();
		ArrayList<Integer> AL=new ArrayList<>();
		System.err.println("enter the input elements: ");
		for (int i = 1; i <=n; i++) {
			int m=nobi.nextInt();
			AL.add(m);
		}
		int sum=0;
		for (Integer z : AL) {
			if(z%2==0) {
				sum+=z;
			}
		}
		System.out.println("Output= " +sum);
		nobi.close();
	}

}
