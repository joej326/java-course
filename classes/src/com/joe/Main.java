package com.joe;

public class Main {

    public static void main(String[] args) {
	    Car joesCar = new Car();
	    joesCar.setMake("Tesla");
        System.out.println(joesCar.getMake());


        BankAccount joesBankAccount = new BankAccount();

        joesBankAccount.setCustomerName("Joseph");
        joesBankAccount.setAccountBalance(500_000);

        System.out.println("bank account:" );
        System.out.println(joesBankAccount.getCustomerName());
        System.out.println(joesBankAccount.getAccountBalance());
    }
}
