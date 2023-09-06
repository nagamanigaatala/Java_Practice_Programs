package com.Practice;

import java.util.Scanner;

public class Fibonaccinseries {

	public static void main(String[] args) {
		Scanner nobi=new Scanner(System.in);
		System.out.println("enter the numbers");
		int n=nobi.nextInt();
		int a=0,b=1,c, i, count=10;
		for(i=1;i<count;i++) {
		c=a+b;
		a=b;
		b=c;
		System.out.println(c);
		}
		nobi.close();
	}
}
