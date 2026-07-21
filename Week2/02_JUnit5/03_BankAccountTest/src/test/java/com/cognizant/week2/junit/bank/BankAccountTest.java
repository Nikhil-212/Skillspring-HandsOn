package com.cognizant.week2.junit.bank;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class BankAccountTest {
    @Test void depositsMoney() { BankAccount account = new BankAccount(100); account.deposit(50); assertEquals(150, account.getBalance()); }
    @Test void withdrawsMoney() { BankAccount account = new BankAccount(100); account.withdraw(40); assertEquals(60, account.getBalance()); }
}
