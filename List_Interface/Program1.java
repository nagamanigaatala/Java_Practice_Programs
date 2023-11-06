package com.listinterfaces_assignment;

import java.util.ArrayList;
import java.util.Scanner;

public interface Program1 {
	public static void main(String[] args) {
		// 1. WRP to print the sum & average of the elements present in lift
		
		Scanner nobi=new Scanner(System.in);
		System.err.print("enter the input size: ");
		int n=nobi.nextInt();
		ArrayList<Integer> AL= new ArrayList<>();
		System.err.println("enter the input elements: ");
		for (int i = 1; i <= n; i++) {
			int m=nobi.nextInt();
			AL.add(m);
		} 
		int sum=0;
		for (int i = 0; i < AL.size(); i++) {
			sum+=AL.get(i);
		}
		System.out.println("Output= " +sum);
		System.out.println("Average= " + sum/n);
		nobi.close();
	}

}
