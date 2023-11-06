package com.listinterfaces_assignment;

import java.util.ArrayList;
import java.util.Scanner;

public class Program4 {

	public static void main(String[] args) {
		// 4. WAP to merge two lists into a single list
		ArrayList<Integer> AL3=new ArrayList<>();
		ArrayList<Integer> AL1=new ArrayList<>();
		Scanner nobi=new Scanner(System.in);
		System.err.print("enter the input1 size: ");
		int n=nobi.nextInt();
		System.err.println("enter the input1 list elements: ");
		for (int i = 1; i <= n; i++) {
			int b=nobi.nextInt();
			AL1.add(b);
			AL3.add(b);
		}
		ArrayList<Integer> AL2=new ArrayList<>();
		System.err.print("enter the input2 size:");
		int m=nobi.nextInt();
		System.err.println("enter the input2 list elements: ");
		for (int i = 1; i <= m; i++) {
			int c=nobi.nextInt();
			AL2.add(c);
			AL3.add(c);
		}
		System.out.println("input1 list= " +AL1);
		System.out.println("input2 list= " +AL2);
		System.out.println("merge two list= " +AL3);
		nobi.close();
	}

}
