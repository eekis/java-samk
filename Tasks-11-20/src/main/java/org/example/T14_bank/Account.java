package org.example.T14_bank;

import java.util.Random;

public class Account {
    final String number;
    String holder;
    double balance;

    public Account(String holder) {
        this.number = genAccountNumber();
        this.holder = holder;
        this.balance = 0.0;
    }

    String genAccountNumber() {
        Random rand = new Random();

        StringBuilder sb = new StringBuilder(16);
        sb.append("FI");
        for (int i = 0; i < 14; i++) {
            sb.append((char)('0' + rand.nextInt(10)));
        }
        return sb.toString();
    }

    public void withdraw(double value) {
        if (value <= 0) throw new IllegalArgumentException("Withdraw value must be greater than 0.");

        if (this.balance >= value) {
            this.balance -= value;
            System.out.println(value + " withdrawn. New balance: " + this.balance);
        } else {
            System.out.println("Failed to withdraw " + value + " - Insufficient balance.");
        }
    }

    public void deposit(double value) {
        if (value <= 0) throw new IllegalArgumentException("Deposit value must be greater than 0.");

        this.balance += value;
        System.out.println(value + " deposited. New balance: " + this.balance);
    }

    public void getBalance() {
        System.out.println("Account balance: " + this.balance);
    }

    public String getNumber() {
        return this.number;
    }

    protected void getInfo() {
        System.out.println("Account number: " + this.number);
        System.out.println("Account holder: " + this.holder);
        System.out.println("Account balance: " + this.balance);
    }
}
