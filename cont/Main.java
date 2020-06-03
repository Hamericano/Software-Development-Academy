package com.sda.cont;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Cont myNewAccount = new Cont(10,1550);

        do {
            System.out.println("\nWhat action would you like to take ?");

            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Show current balance");
            System.out.println("4. Show monthly interest");

            System.out.println("0. Exit");
            System.out.print("\nYour choice ");
            int choice = input.nextInt();

            switch(choice)
            {
                case 0:
                {
                    System.out.println("Exiting. . .");
                    System.exit(0);
                    break;
                }
                case 1:
                {
                    System.out.println("How much money would you like to deposit? ");
                    myNewAccount.deposit(input.nextDouble());
                    break;
                }
                case 2:
                {
                    System.out.println("How much money would you like to withdraw? ");
                    myNewAccount.withdraw(input.nextDouble());
                    break;
                }
                case 3:
                {
                    System.out.println("Your current balance is " + myNewAccount.getSold() + " $");
                    break;
                }
                case 4:
                {
                    System.out.println("Bank's interest rate is ");
                    double interest = input.nextDouble();
                    System.out.println("Monthly interest is " + myNewAccount.getMonthlyInterest(interest));
                    break;
                }
            }
        }while(true);
    }
}
