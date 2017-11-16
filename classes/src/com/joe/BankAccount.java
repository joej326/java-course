package com.joe;

public class BankAccount {
    private String customerName;
    private int accountBalance;

    // a constructor is created by making a method of the same name as the class.
    // this constructor is called automatically whenever we create a new instance with the "new" keyword.
    // you can have more than one constructor as seen here.

    // this first constructor is calling the second constructor and passing in the parameters with the "this."
    // this is the only case where we'd see "this" used in this manner.
    // note that this is redundant, it's just for showcasing purposes.
    // we could've just had one constructor that we passed arguments into.
    public BankAccount(){
        this("something", 10);
        System.out.println("BankAccount constructor was called!");
    }
    public BankAccount(String thing1, int thing2){
        System.out.println("BankAccount constructor was called!");
    }

    public void setCustomerName(String name){
        this.customerName = name;
    }
    public String getCustomerName(){
        return this.customerName;
    }

    public void setAccountBalance(int balance){
        this.accountBalance = balance;
    }
    public int getAccountBalance(){
        return this.accountBalance;
    }
}
