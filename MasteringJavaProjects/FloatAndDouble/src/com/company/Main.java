package com.company;

public class Main {

    public static void main(String[] args) {
	    float floatMinVal = Float.MIN_VALUE;
	    float floatMaxVal = Float.MAX_VALUE;

        System.out.println("min float val is " + floatMinVal);
        System.out.println("max float val is " + floatMaxVal);

        double doubleMinVal = Double.MIN_VALUE;
        double doubleMaxVal = Double.MAX_VALUE;

        System.out.println("min double val is " + doubleMinVal);
        System.out.println("max double val is " + doubleMaxVal);

        int myIntValue = 5/2;
        float myFloatValue = 5f/2f;
        double myDouble = 5/2d;

        System.out.println("float val is " + myFloatValue);
        System.out.println("double val is " + myDouble);
        System.out.println("int val is " + myIntValue);

    }
}
