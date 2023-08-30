package com.Arrays;

public class Array_1d_practice {

	    public static void main(String[] args) {
	        //1. ONE DIMENTIONAL ARRAY
	        //int[] j=new int[5];
	        //j[0]=3;
	        //j[1]=2;
	        //j[4],6=4;
	        int[] j={2,4,5,4,6};
	        System.out.println("size is"+ j.length);
	        //int[] j=new int[]{2,4,5,4,6};
	        //System.out.println(j[1]);
	        //System.out.println(j[4]);
	         for(int i=0; i<j.length;i++){
	            System.out.println(j[i]);
	        }
	        int sum=j[0]+j[1]+j[2]+j[3]+j[4];
	        System.out.println("total range "+ sum);
	        //while loop
	        /*int i=0;
	        while (i<j.length) {
	            System.out.println(j[i]);
	            i++;
	        }*/

	    }


}
