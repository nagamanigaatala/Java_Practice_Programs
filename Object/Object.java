package com.Object;

public class Object {
	 public Object(){

	    }
	    public Object(int a){

	    }
	 public static void main(String[] args) {
		
		    Object nobi= new Object();
	        Object chan= new Object(10);
	        Object shara= new Object(20);
	        Object manu = new Object();
	        System.out.println(nobi.hashCode());
	        System.out.println(chan.hashCode());
	        System.out.println(shara.hashCode());
	        System.out.println(manu.hashCode());
	        System.out.println(chan==shara);
	}

}
