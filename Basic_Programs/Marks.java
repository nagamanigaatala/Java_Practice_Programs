package 
com.Practice;

import java.util.Scanner;

public class Marks {

	public static void main(String[] args) {
		/*
		 * 34 - fail
		 * 35 - just pass
		 * 36 to 50 - below average
		 * 51 to 70 - average
		 * 71 to 90 - good
		 * 91 to 100 - excellent 
		 */
		Scanner nobi=new Scanner(System.in);
		System.out.println("enter your marks:");
		int marks=nobi.nextInt();
		if(34>marks) {
			System.out.println("fail");
		}
		else if (35==marks) {
			System.out.println("just pass");
		}
		else if(36<=marks && 50>marks) {
			System.out.println("below average");
		}
		else if(51<=marks && 70>marks) {
			System.out.println("average");
		}
		else if(71<=marks && 90>marks) {
			System.out.println("good");
		}
		else 
			System.out.println("excellent");
		}

}
