package com.Practice;

import java.util.Scanner;

public class Prime_num {

	public static void main(String[] args) {
		int count=0;
		Scanner nobi=new Scanner(System.in);
		System.out.println("enter the number:");
		int n=nobi.nextInt();
		for(int i=1; i<=n; i++) {
			if(n%i==0) {
				count++;
			}
		}
		if(count==2) 
			System.out.println("prime num");
		else 
			System.out.println("not prime num");
       	nobi.close();
	}
}
