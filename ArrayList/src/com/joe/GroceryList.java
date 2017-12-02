package com.joe;

import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<String>();


    public void addGroceryItem(String item){
        groceryList.add(item);
    }

    public void printGroceryList(){
        System.out.println("Here is your grocery list:" + "\n");
        for(int i=0;i<groceryList.size();i++){
            System.out.println((i+1) + ". " + groceryList.get(i)); // we use .get to get an item at an index in an ArrayList
        }
        System.out.println("\n" + "Here is the size of your list:");
        System.out.println(groceryList.size());
    }

    public void modifyItem(int index, String newItem){
        groceryList.set(index, newItem);
        System.out.println("Grocery item " + (index+1) + " has been modified!" + "\n");
        for(int i=0;i<groceryList.size();i++){
            System.out.println((i+1) + ". " + groceryList.get(i)); // we use .get to get an item at an index in an ArrayList
        }
    }

    public void removeItem(int index){
        groceryList.remove(index);
        System.out.println("Grocery item " + (index+1) + " has been removed!" + "\n");
        for(int i=0;i<groceryList.size();i++){
            System.out.println((i+1) + ". " + groceryList.get(i)); // we use .get to get an item at an index in an ArrayList
        }
    }

}


