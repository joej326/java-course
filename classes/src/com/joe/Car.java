package com.joe;

public class Car {
    public int wheels;
    private String make; // we can access this private variable outside with getters and setters
    public int year;

    public void setMake(String suppliedMake){
        this.make = suppliedMake;
    }

    public String getMake(){
        return this.make;
    }
}
