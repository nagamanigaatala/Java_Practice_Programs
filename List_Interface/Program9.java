package com.listinterfaces_assignment;

import java.util.ArrayList;
import java.util.Scanner;

public class Program9 {

	public static void main(String[] args) {
		// WAP to create a list of prime 
		ArrayList<Integer> AL =new ArrayList<>();
		Scanner nobi=new Scanner(System.in);
		System.err.println("enter the input element: ");
		int n=nobi.nextInt();
		int count=0;
		for (int i = 1; i <= n; i++) {
			
			AL.add(i);
			if(n%i==0) {
				count+=1;
			}
		}
		if(count==2) {
			System.out.println("Output "+"prime");
		}
		else
			System.out.println("Output= "+"not prime");
		nobi.close();
	}
}
