package com.codsoft;

public class BankAccount {
    private double accbalance;

    public BankAccount(double initialBalance){
        accbalance=initialBalance;
    }
    public double getBalance(){
        return accbalance;
    }
    public void deposit(double amount){
        accbalance+=amount;
    }
    public boolean Withdraw(double amount){
        if(amount <= accbalance){
            accbalance -=amount;
            return true;
        }else{
            return false;
        }
    }
}
