package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Integer myInteger = new Integer(25);
        System.out.println(myInteger.intValue());



        ArrayList<Integer> myArrayList = new ArrayList<Integer>();
        for(int i = 0;i<=10;i++){
            myArrayList.add(Integer.valueOf(i)); // this is autoboxing. Taking a primitive type (int) and converting
        }                                        // it to the Integer class.
        System.out.println(myArrayList);



        System.out.println(myArrayList.get(6).intValue()); // this is unboxing. Converting it back to primitive (int)


        // JAVA SHORTCUTS!
        Integer myOtherInteger = 56; // Java automatically does: Integer.valueOf(56) so u don't have to use new.
        int mySpecialInt = myOtherInteger; // Java automatically does: myOtherInteger.intValue() to make it primitive.

    }
}
