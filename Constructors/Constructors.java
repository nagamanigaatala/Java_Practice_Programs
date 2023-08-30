package com.Constructors;

public class Constructors {
	 public int i; 
	public static void main(String[] args) {
		 Constructors nobi = new Constructors(); //implicit constructor
	        System.out.println(nobi.i); 
	    } 
	    public Constructors(){ //explicit constructors
	        i = 20;
	        System.out.println("constructor is called");
	    }
	    public Constructors(int a){ //parameterized constructor
	        i = a;
	    
	}

}
