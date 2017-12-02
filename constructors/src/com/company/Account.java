package com.company;

public class Account {

    public String name;
    public int balance;
    public String status;

    public Account() {
        this("default name",5000,"default");
    }

    public Account(String name) {
        this(name, 5000, "default");
    }

    public Account(String name, int balance, String status) {
        this.name = name;
        this.balance = balance;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public String getStatus() {
        return status;
    }
}
