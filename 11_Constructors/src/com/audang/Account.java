package com.audang;

public class Account {
    private String accountNumber;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String customerPhoneNumber;

    public Account() {
        this("5678", 2.50, "Default name", "Default address", "default phone");
        System.out.println("Account constructor created");
    }

    public Account(String accountNumber, double balance, String customerName, String customerEmail, String customerPhoneNumber) {
        System.out.println("Constructor with parameters created");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public Account(String customerName) {
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public void deposit(double depositAmount) {
        this.balance += depositAmount;
    }

    public void withdrawal(double withdrawalAmount) {
        if (balance - withdrawalAmount < 0) {
            System.out.println("Only " + balance + " available. Withdrawal not processed");
        } else {
            this.balance -= withdrawalAmount;
            System.out.println("Withdrawal of " + withdrawalAmount + " processed. " + this.balance + " left.");
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }
}
