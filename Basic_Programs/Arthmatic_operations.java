package com.Practice;

import java.util.Scanner;

public class Arthmatic_operations {

	public static void main(String[] args) {
		Scanner nobi=new Scanner(System.in);
		int num1, num2, result;
		System.out.println("enter your numbers:");
		num1=nobi.nextInt();
		num2=nobi.nextInt();
	    result=num1+num2;
	    //result=num1-num2;
	    //result=num1*num2;
	    //result=num1/num2;
		System.out.println("sum of the numbers=" + result);
		nobi.close();
	}
}

