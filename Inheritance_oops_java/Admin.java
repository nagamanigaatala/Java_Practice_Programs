package com.Inheritance;

public class Admin extends Developer{
	//adding or deleting the products/applications
	public void manage() {
	    super.read();
		write();
		System.out.println("manage coder");
	}
	public void read() {
		System.out.println("admin read code");
	}
}
