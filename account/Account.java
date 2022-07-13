package com.bridgelabz.account;

import java.util.Scanner;

public class Account {
    public static void main(String[] args) {
        AccountManagement acm = new AccountManagement();
        System.out.println("Welcome to Account class ");
        Scanner scanner = new Scanner(System.in);

        boolean check = true;
        while(check == true){
            System.out.println("Press \n1. for withdraw money \n2.for display balane amount \n3.for exit");
            int choice = scanner.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Enter amount to withdraw ");
                    int withdrawAmount = scanner.nextInt();
                    acm.debit(withdrawAmount);
                    break;
                case 2:
                    System.out.println("Balance amount in the account "+acm.getBalance());
                    break;
                case 3:
                    System.out.println("Exit successfully");
                    check = false;
                    break;
                default:
                    System.out.println("choose carefully");
            }
        }
    }
}
