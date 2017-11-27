package com.joe;

public class Cat extends Animal {
    private String awesomeness; // this is specific to Cat and therefore not found on Animal, so this gets added to the Cat constructor

    public Cat(String name, int tails, String awesomeness) { // we got rid of "int brains" from our cat constructor b/c in the super, we are passing 1
        super(1, name, tails); // super calls the constructor of the parent class
                                    // we can pass "1" for the "brains" argument because all of our cats will have 1 brain
        this.awesomeness = awesomeness;
    }

    public String getAwesomeness() {
        return this.awesomeness;
    }
}
