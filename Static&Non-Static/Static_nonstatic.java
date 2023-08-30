package com.staticnonstatic;
import java.util.Random;
public class Static_nonstatic {
	static int number;
	public static void main(String[] args) {
		
		Static_nonstatic.number =new Random().nextInt();
		
		Static_nonstatic.number =new Random().nextInt();
		
		Static_nonstatic.number=new Random().nextInt();
		
		System.out.println(Static_nonstatic.number);
		System.out.println(Static_nonstatic.number);
		System.out.println(Static_nonstatic.number);
	}
	public static void print() {
		System.out.println("static method");
	}
	public void print1() {
		System.out.println("Non-static method");
	}
}
