package com.staticnonstatic;

public class Static_nonstatic_block {
	//Block
	static {
		System.out.println("static block");
	}
	{
		System.out.println("non-static block");
	}
	
	//Constructor
	public Static_nonstatic_block() {
		System.out.println("constructor");
	}
	public static void main(String[] args) {
		System.out.println("main method");
		new Static_nonstatic_block();
	}

}
