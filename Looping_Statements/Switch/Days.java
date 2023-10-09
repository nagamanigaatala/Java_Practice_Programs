package com.Switch;

import java.util.Scanner;

public class Days {

	public static void main(String[] args) {
		/*
		 * Monday to friday -> Uff, its a weekday
		 * saturday to sunday -> Yayy,Its a weekend 
		 */
		Scanner nobi=new Scanner(System.in);
		System.err.println("enter your dayName:");
		String dayName=nobi.nextLine();
		switch(dayName) {
		case "monday":
			System.out.println("Uff, its a weekday");
		break;
		case "tueday":
			System.out.println("Uff, its a weekday");
			break;
		case "wenday":
			System.out.println("Uff, its a weekday");
			break;
		case "thuday":
			System.out.println("Uff, its a weekday");
			break;
		case "friday":
			System.out.println("Uff, its a weekday");
			break;
		case "satday":
			System.out.println("Yayy,Its a weekend");
			break;
		case "sunday":
			System.out.println("Yayy,Its a weekend");
			break;
		default:
			System.out.println("invaild dayName");
		}
	}
}