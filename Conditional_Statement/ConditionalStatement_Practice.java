package com.ConditionalStatement;

import java.util.Scanner;

public class ConditionalStatement_Practice {

	public static void main(String[] args) {
		//prime number
        int count =0;
        System.out.println("enter a num:");
        Scanner nobi = new Scanner(System.in);
        int n = nobi.nextInt();
        for(int i=1;i<=n;i++){
            if(n%i==0){
            count++;
        }
    }
    if(count==2)
    System.out.println("prime num");
    else
    System.out.println("not prime");
    
    //num is even or odd
    /**Scanner nobi = new Scanner(System.in);
    System.out.println("enter the num:");
    int n = nobi.nextInt();
        if(n%2==0){
             System.out.println("num is even");    
            }
        else{
            System.out.println("num is odd");
        }*/
        
        //Student Result
       /**  Scanner nobi = new Scanner(System.in);
        System.out.println("enter the result");
        int n =nobi.nextInt();
            if(n<=30){
                System.out.println("failed");
            }
            else if(n<=50){
                System.out.println("just pass");
            }
            else if(n<=80){
                System.out.println("avg");
            }
            else{
                System.out.println("excellent");
            } */

            //weeks in switch
             /**int day;
            Scanner nobi =new Scanner(System.in);
            System.out.print("enter num 1-7 :");
            day = nobi.nextInt();
            switch (day){
                case 1:
                System.out.println("sunday");
                break;
                case 2:
                System.out.println("monday");
                break;
                case 3:
                System.out.println("tuesday");
                break;
                case 4:
                System.out.println("wednesday");
                break;
                case 5:
                System.out.println("thursday");
                break;
                case 6:
                System.out.println("friday");
                break;
                case 7:
                System.out.println("saturday");
                break;
                default:
                System.out.println("default");
                break;
            } */
            //even or odd using switch
              /* Scanner nobi =new Scanner(System.in);
               int num= 0;
               System.out.println("enter the num:");
               num =nobi.nextInt();
               switch(num%2){
                case 0:
                System.out.println("even");
                break;
                case 1:
                System.out.println("odd");
                break;
                default:
                System.out.println("default");
                break;
             } 
               nobi.close();*/
	}

}
