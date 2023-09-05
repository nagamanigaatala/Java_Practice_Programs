package com.Practice;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		Scanner nobi=new Scanner(System.in);
		System.out.println("enter your digits:");
		int n=nobi.nextInt();
		int  digit, sum=0;
		while(n > 0){  
		//finds the last digit of the given number    
		digit = n % 10;  
		sum = sum + digit;  
		//removes the last digit from the number  
		n = n / 10;  
		}   
		System.out.println("Sum of Digits: "+sum);  
		nobi.close();
	}  
}
