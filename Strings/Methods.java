package com.str;
public class Methods {

	public static void main(String[] args) {
		// Methods
		String s1="neelu";
		String s2="Neelu";
		String s3=" nobi ";
		int i=10;
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.contains("b"));
		System.out.println(s1.startsWith("m"));
		System.out.println(s1.endsWith("u"));
		System.out.println(s1.length());
		System.out.println(s3.trim().length());
		System.out.println(s2.toLowerCase());
		System.out.println(s1.toUpperCase());
		System.out.println(s1.split("\\^"));//doubt
		System.out.println(s1.charAt(0));
	    System.out.println(s1.replace("e", "i"));
		String s=String.valueOf(i);
		System.out.println(s);
		System.out.println(s3.isBlank());
		System.out.println(s1.isEmpty());
		System.out.println(s1.toCharArray());
		System.out.println(s1.indexOf("e"));
		System.out.println(s1.lastIndexOf("e"));
		System.out.println(s1.substring(3));
		System.out.println(s1.substring(1,4));
		
	
	}

}
