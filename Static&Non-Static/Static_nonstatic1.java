package com.staticnonstatic;

public class Static_nonstatic1 {

	public static void main(String[] args) {
		//declare the Static_nonstatic file here
		System.out.println(Static_nonstatic.number);
		Static_nonstatic.print();
		
		//Non static method
		Static_nonstatic t1=new Static_nonstatic();
		t1.print1();
	}

}
