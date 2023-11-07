package com.codsoft;

import java.util.Scanner;

public class ATM_machine 
{
    private static BankAccount userAccount; 
    public static void main( String[] args )
    {
        

        int user_input;
        userAccount = new BankAccount(1000.0);
        Scanner sc=new Scanner(System.in);

        System.out.println("Welcome!");
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println(" ");
        System.out.println("What would you like to do?");
        System.out.println("1. Withdraw");
        System.out.println("2. Deposit");
        System.out.println("3. Check Balance");
        System.out.println("4. Exit");
        System.out.print("Select an option: ");
        user_input=sc.nextInt();

        if(user_input==1){
            System.out.print("Enter withdrawal amount: R");
            double amount = sc.nextDouble();
            Withdraw(amount);
        }
        else if (user_input==2) {
            System.out.print("Enter the deposit amount: R");
            double amount = sc.nextDouble();
            Deposit(amount);
        }
        else if (user_input==3) {
            checkBalance();
        }
        else if(user_input==4){
            System.out.println("GOODBYE!");
            System.exit(0);
        }
        else{
            System.out.println("Invalid Input!");
        }

    }

    static void Withdraw(double amount){
        if (userAccount.Withdraw(amount)) {
            System.out.println("Withdrew R"+amount+" successfully.");
        }
        else{
            System.out.println("Insufficient funds!");
        }
    }
    static void Deposit(double amount){
        if(amount>0){
            userAccount.deposit(amount);
            System.out.println("Deposited R"+amount+" successfully.");
        }
        else{
            System.out.println("Invalid deposit amount.");
        }
    }
    static void checkBalance(){
       
        System.out.println("Your Account Balance is: R"+userAccount.getBalance());
    }
}
