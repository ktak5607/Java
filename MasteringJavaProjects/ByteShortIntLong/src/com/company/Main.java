package com.company;

public class Main {

    public static void main(String[] args) {
	    int myIntMin = Integer.MIN_VALUE;
	    int myIntMax = Integer.MAX_VALUE;
        System.out.println("Min value for an int is " + myIntMin);
        System.out.println("Max value for an int is " + myIntMax);
        System.out.println("busted max is " + (myIntMax + 1));

        byte myMinByte = Byte.MIN_VALUE;
        byte myMaxByte = Byte.MAX_VALUE;
        System.out.println("min byte val is " + myMinByte);
        System.out.println("max byte val is " + myMaxByte);

        short myMinShort = Short.MIN_VALUE;
        short myMaxShort = Short.MAX_VALUE;
        System.out.println("min short val is " + myMinShort);
        System.out.println("max short val is " + myMaxShort);

        short test = 12;

        long myLongVal = 100L;
        long myMinLong = Long.MIN_VALUE;
        long myMaxLong = Long.MAX_VALUE;
        System.out.println("min long val is " + myMinLong);
        System.out.println("max long val is " + myMaxLong);

        byte testByte = (byte)(myMinLong/2);

        byte myByte = 12;
        short myShort = 123;
        int myInt = 12345;
        long myLong = 50000L + 10L * (myByte + myShort + myInt);
        System.out.println(myLong);
    }
}
