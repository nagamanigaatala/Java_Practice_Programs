package com.Switch;

import java.util.Scanner;

public class Adding_twonum {

	public static void main(String[] args) {
		// perform arithmetic operations on two numbers
		Scanner nobi=new Scanner(System.in);
		System.err.print("enter first number:");
		int firstNum=nobi.nextInt();
		System.err.print("enter second number:");
		int secondNum=nobi.nextInt();
		System.err.print("enter the operation:");
		String operations=nobi.next();
		int result=0;
		switch (operations) {
		case "+":
			result=firstNum+secondNum;
		break;
		case "-":
			result=firstNum-secondNum;
			break;
		case "*":
			result=firstNum * secondNum;
			break;
		case "/":
			result=firstNum / secondNum;
			break;
		case "%":
			result=firstNum % secondNum;
			break;
		default:
			System.out.println("invaild operation");
		}
		System.out.println(result);
		nobi.close();
	}

}
