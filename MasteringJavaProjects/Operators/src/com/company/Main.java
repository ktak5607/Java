package com.company;

public class Main {

    public static void main(String[] args) {
        int result = 1 + 2;//1 + 2 = 3
        System.out.println(result);
        int prevResult = result;
        System.out.println("previous result is " + prevResult);
        result = result - 1;
        System.out.println("3 - 1 = " + result);

        result = result * 10;
        System.out.println("2 * 10 = " + result);
        result = 4 % 3;
        result++;
        result--;
        result += 2;
        result *= 10;
        System.out.println(result);

        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It is not an alien");
            System.out.println("Which is good");
        }


        int topScore = 100;
        if(topScore != 100){
            System.out.println("You've got the high score");
        }
        boolean isCar = false;
        boolean wasCar = isCar ? true : false;
        if(wasCar){
            System.out.println("wasCar is true");
        }
    }
}
