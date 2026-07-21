package com.cognizant.week2.junit.bank;

public class BankAccount {
    private double balance;
    public BankAccount(double balance) { this.balance = balance; }
    public void deposit(double amount) { balance += amount; }
    public void withdraw(double amount) { if (amount > balance) throw new IllegalArgumentException("Insufficient balance"); balance -= amount; }
    public double getBalance() { return balance; }
}
