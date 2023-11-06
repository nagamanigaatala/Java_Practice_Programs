package com.listinterfaces_assignment;

import java.util.ArrayList;
import java.util.Scanner;

public class Program5 {

	public static void main(String[] args) {
		// 5. WAP to print the repeated/duplicate elements along with its repetition count
		ArrayList<Integer> AL1=new ArrayList<>();
		ArrayList<Integer> AL2=new ArrayList<>();
		ArrayList<Integer> AL3=new ArrayList<>();
		Scanner nobi=new Scanner(System.in);
		System.err.print("enter the input size: ");
		int n=nobi.nextInt();
		System.err.println("enter the input element: ");
		for (int i = 1; i <= n; i++) {
			int m=nobi.nextInt();
			AL1.add(m);
		}
		// Duplicates
		for (int i = 0; i < AL1.size(); i++) {
			int count=0;
			for (int j = 0; j < AL1.size(); j++) {
				if(AL1.get(i).equals(AL1.get(j))) {
					count+=1;
				}
			}
			if(count>1) {
				AL2.add(AL1.get(i));
			}
		}
		//Filtering and storing (duplicates only once) in a new list
		for (int i = 0; i <AL2.size(); i++) {
			if(AL3.contains(AL2.get(i))==false) {
				AL3.add(AL2.get(i));
			}
		}
		//printing duplicates and its count
		for (int i = 0; i < AL3.size(); i++) {
			int c=0;
			for (int j = 0; j <AL2.size(); j++) {
				if(AL3.get(i).equals(AL2.get(j))) {
					c+=1;
				}
			}
			System.out.println("output= "+AL3.get(i)+" - " +c);
		}
		nobi.close();
	}

}
