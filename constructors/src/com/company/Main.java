package com.company;

public class Main {

    public static void main(String[] args) {



        Account joesAccount = new Account();
        System.out.println(joesAccount.getName());

        Account billiardsAccount = new Account("Billiard");
        System.out.println(billiardsAccount.getName());

        Account supermansAccount = new Account("Superman", 1000000000, "kryptonian");
        System.out.println(supermansAccount.getName());
    }
}
