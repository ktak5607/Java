package com.company;

public class Main {

    public static void main(String[] args) {
	    double val1 = 20.00d;
	    double val2 = 80.0d;
	    double val3 = (val1 + val2) * 100.00d;
	    double remainder = (val3 % 40.0d);

	    boolean remainderTest = (remainder == 0) ? true : false;
        System.out.println(remainderTest);

        if(!remainderTest){
            System.out.println("Got some remainder.");
        }

    }
}
