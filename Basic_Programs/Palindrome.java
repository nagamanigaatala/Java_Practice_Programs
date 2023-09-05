package com.Practice;

import java.util.Iterator;
import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {	
	Scanner nobi=new Scanner(System.in);
	System.out.println("enter your num:");
	int n=nobi.nextInt();
	int r, temp=0, sum=0; 
	temp=n;
	while(n>0) {
		r=n%10;
		sum=(sum*10)+r;    
		   n=n/10;   
	}
	if(temp==sum)    
		   System.out.println("palindrome number");    
		  else    
		   System.out.println("not palindrome"); 
	nobi.close();
	}
}
