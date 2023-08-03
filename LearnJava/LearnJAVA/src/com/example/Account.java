package com.example;

import java.util.ArrayList;
import java.util.Date;

public class Account {
    private int Id;
    private double balance;
    private double AnnualInterestRate;
    private Date dateCreated;

    Client client;
    ArrayList<Transaction> transactions;



    public Account(int Id,double balance,double AnnualInterestRate, Client client)
    {
        this.Id = Id;
        this.balance = balance;
        this.AnnualInterestRate = AnnualInterestRate;
        this.client = client;
        this.transactions = new ArrayList<>();

        dateCreated = new Date();
    }

    public boolean withdraw(double Amount)
    {
        if(Amount <= this.balance) {
            this.balance = this.balance - Amount;

            this.transactions.add(new Transaction('W',Amount,this.balance,"Withdrawn "+ Amount));
            return true;
        }
        else
            return false;
    }

    public void deposit(double Amount)
    {
        this.balance += Amount;
        this.transactions.add(new Transaction('D',Amount,this.balance,"Diposited "+ Amount));
    }
    public int countTransaction(char Type)
    {
        int count = 0;
        for(Transaction transaction: transactions)
            if(transaction.getType() == Type)
                count++;
        return count;
    }
    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return AnnualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        AnnualInterestRate = annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public String toString()
    {
        String str = this.Id +" " + this.balance + " " +this.AnnualInterestRate;
        return str;
    }

}
