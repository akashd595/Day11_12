package com.bridgelabz.account;

public class AccountManagement {
    private int balance = 20000;
    boolean status=true;
    int remAmount;

    public int getBalance() {
        return balance;
    }

    public int debit(int amount){
        balance(amount);
        if(status == false){
            System.out.println("withdrawing amount is more than balance amount ");
        }else{
            balance = balance - amount;
            System.out.println("Amount "+amount+" withdrawn successfully from your account ");
            System.out.println("Balance left "+balance);
        }
        return balance;
    }
    public void balance(int amount){
        if(amount>balance){
            status = false;
        }
    }
}

