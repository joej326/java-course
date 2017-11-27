package com.joe;

public class Computer {
    private Dimensions dimensions; // this is called composition. We assign the type to a class we made.

    public Computer(Dimensions dimensions) {
        this.dimensions = dimensions;
    }
}
