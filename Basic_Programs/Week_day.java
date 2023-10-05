package com.Practice;

import java.util.Scanner;

public class Week_day {

	public static void main(String[] args) {
		/*
		 * Monday to friday -> Uff, its a weekday
		 * saturday to sunday -> Yayy,Its a weekend 
		 */
		Scanner nobi=new Scanner(System.in);
		System.out.println("enter your dayName name:");
		String dayName=nobi.nextLine();
		if(dayName.equals("Monday") ||
		   dayName.equals("Tueday") ||
		   dayName.equals("Wenday") ||
		   dayName.equals("Thuday") ||
		   dayName.equals("Friday") ) {
			System.out.println("Uff, its a weekday");
		}
		else if(dayName.equals("Satday") ||
				dayName.equals("Sunday")) 
			System.out.println("Yayy,Its a weekend ");
		
		}
}
