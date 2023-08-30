package com.LoopingStatements;

import java.util.Scanner;

public class LS_practice {

	public static void main(String[] args) {
		//print the nums 1-100
        int i = 1;
        while (i<=100) {
            System.out.println(i);
            i++;
            }
            // do while
            /*int i=1;
            do {
                System.out.println(i);
                i++;
            } while (i<=100);*/

            // print the even nums 200-500
           /*  int i =200;
            while (i<=500) {
                if(i%2==0){
                    System.out.println(i);
               }
               i++;
            }*/
            //do while loop
           /*  int i =200;
            do {
                if(i%2==0){
                System.out.println(i);
                 }i++;
            } while (i<=500); */

            //divisible by 7 using while loop
            /*int i = 150;
            while (i<=200) {
                if (i%7==0) {
                    System.out.println(i);
                     }
                     i++;
                    } */
            //do while
           /*  int i =150;
            do {
                if (i%7==0) {
                    System.out.println(i);
                    }
                    i++;
            } while (i<=200); */
              
               /*  Scanner nobi = new Scanner(System.in);
                System.out.println("enter the starting range:");
                int n = nobi.nextInt();
                System.out.println("enter ending range:");
                int m =nobi.nextInt();
                int i =1;
                int count=0;
                while (i<=m) {
                    while (i<=n) {
                        
                    if (n%i==0) {
                        count+=1;
                    }
                    i++;
                } if (count==2) {
                    System.out.println(n);
                    count=0;
                }
                n++;
                i=1;
             }*/
             //for loop
             
             /*for(int i=1; i<=100;i++){
                if (i%2==0) {
                    System.out.println(i); 
                }
             }*/

             /*int i;
             for(i=20;i<=50;i++){
                if (i%7==0) {
                    System.err.println(i);
                }
             } */
		
		     /*int count=0;
             System.out.println("enter the num:");
             Scanner nobi =new Scanner(System.in);
             int n =nobi.nextInt();
             for(int i = 1; i<=n; i++) {
                if (n%i==0) {
                   count++; 
                }
            }
                 if (count==2) {
                        System.out.println("prime");
                 }
                 else
                    System.out.println("not prime");
                    nobi.close(); */
	}

}
