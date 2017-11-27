package com.joe;

public class Animal {
    private int brains;
    private String name;
    private int tails;

    public Animal(int brains, String name, int tails) {
        this.brains = brains;
        this.name = name;
        this.tails = tails;
    }

    public int getBrains() {
        return brains;
    }

    public String getName() {
        return name;
    }

    public int getTails() {
        return tails;
    }
}
