package com.joe;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // write your code here
        GroceryList myGroceryList = new GroceryList();

        myGroceryList.addGroceryItem("Ham");
        myGroceryList.addGroceryItem("Bread");
        myGroceryList.addGroceryItem("Eggs");

        myGroceryList.printGroceryList();

        myGroceryList.modifyItem(2, "Peanut Butter");
        myGroceryList.removeItem(1);
    }
}
