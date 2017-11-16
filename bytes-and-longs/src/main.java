package com.joe;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int firstInt =  8_474_659; // use underscored to make large numbers easier to read
        int secondInt = 8888;
        byte myByte = 10; //bytes are small versions of ints and can be -128 to 127
        short myShort = 10000; // short is bigger than a byte but smaller than an int
        long myLong = 1000000000L; // long has twice the width (aka memory) as an int. Put an "L" at the end of an long to signify that it's a long

        byte newByte = (byte) (secondInt/2); // we get an error when we try to assign newByte to secondInt/2 because b/c java freaks out that we are trying to assign an int to a byte.
        // The fix for this is to do what's called "casting" where we say (byte) before the assignment to tell java to treat the int as a byte.
    }
}
