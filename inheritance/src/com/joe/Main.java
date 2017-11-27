package com.joe;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Cat joesCat = new Cat("fluffles", 1, "super really awesome");

        System.out.println(joesCat.getAwesomeness());


        //*********************************************************************************************************



        Dimensions myLittleDimension = new Dimensions(500, 750);

        Computer joesComputer = new Computer(myLittleDimension); // Computer is expecting a Dimension in its contructor.


        Computer otherComputer = new Computer(new Dimensions(400,875)); // alternative to having to declare a new dimensions class like above with "joesComputer"
    }
}
