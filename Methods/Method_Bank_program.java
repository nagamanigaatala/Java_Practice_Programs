package com.Methods;

public class Method_Bank_program {
	static int currentBalance = 1000;
    public static void greetCustomer(){
        System.out.println("Hello, welcom to the banking application");
    }
    //non static method
    public void deposit(int amount){
        currentBalance = currentBalance + amount;
        System.out.println("amount is deposited succefully");
    }
    public static void withdrawal(int amount){
        currentBalance = currentBalance - amount;
        System.out.println("Amount is withdraw successfully");
    }
    public int getCurrentBalance(){
        return currentBalance;
    }
    public static void main(String[] args){
    	Method_Bank_program bank=new Method_Bank_program();
    	greetCustomer();
        System.out.println("current balance is: "+bank.getCurrentBalance());
        bank.deposit(500);
        System.out.println("current balance is: "+bank.getCurrentBalance());
        withdrawal(300);
        System.out.println("current balance is: "+bank.getCurrentBalance());
    }
}
