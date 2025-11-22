package com.myproject;

public class BankAccount {
    private int accNo;
    private String holderName;
    private double balance;

    public BankAccount(int accNo, String holderName, double balance) {
        this.accNo = accNo;
        this.holderName = holderName;
        this.balance = balance;
    }

    public void printDetails() {
        System.out.println("Account No: " + accNo);
        System.out.println("Name: " + holderName);
        System.out.println("Balance: " + balance);
    }
}
