package com.Practice;

import java.util.Scanner;

public class Palindrome1 {

	public static void main(String[] args) {
		Scanner nobi=new Scanner(System.in);
		System.err.print("enter the num:");
		int n=nobi.nextInt();
		int rev=0, on=n;
		while(n!=0) {
			rev=rev*10+n%10;
			n=n/10;
		}
		if(on==rev) {
			System.out.println(on +" "+ "palindrome");
		}
		else
			System.out.println(on + " " + "not palindrome");
		
		// String Palindrome
		/*Scanner nobi=new Scanner(System.in);
		System.err.print("enter your string:");
		String str=nobi.nextLine();
		String num=str, rev="";
		int len=str.length();
		for(int i=len-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		if(num.equals(rev)) {
			System.out.println(rev + " "+"is palindrome string");
		}
		else
			System.out.println(rev+" "+"is not palindrome string"); */
		
	}

}
