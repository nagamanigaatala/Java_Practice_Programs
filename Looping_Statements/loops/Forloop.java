package com.loops;

import java.util.Scanner;

public class Forloop {

	public static void main(String[] args) {
		Scanner nobi=new Scanner(System.in);
		System.err.println("enter the starting range:");
		int n=nobi.nextInt();
		System.err.println("enter the ending range:");
		int m =nobi.nextInt();
		for(int i=1;i<=m;i++) {
			if(n<=m) {
				System.out.println(i);
			}
		}
		nobi.close();
	}

}
