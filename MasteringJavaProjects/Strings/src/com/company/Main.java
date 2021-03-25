package com.company;

public class Main {

    public static void main(String[] args) {
	    String myString = "this is a string";
        System.out.println("My string is " + myString);
        myString = myString + " a little more";

        System.out.println("My string is " + myString);
        myString = myString + " \u0E04";

        System.out.println("My string is " + myString);

        String numberString = "215.5";
        numberString = numberString + "220.11";

        System.out.println(numberString);
    }
}
