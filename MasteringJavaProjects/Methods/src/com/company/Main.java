package com.company;

public class Main {

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){
        if(gameOver){
            int finalScore = score + (levelCompleted * bonus);
            return finalScore;
        }
        return -1;
    }

    public static void DisplayHighScorePosition(String playerName, int pos){
        System.out.println(playerName + " managed to get into position " + pos + " on the high score board");
    }
    public static int CalculateHighScorePosition(int score){
//        if(score >= 1000){
//            return 1;
//        }
//        else if(score >= 500){
//            return 2;
//        }
//        else if(score >= 100){
//            return 3;
//        }
//        else{
//           return 4;
//        }
        int pos = 4;
        if(score >= 1000){
            pos = 1;
        }
        else if(score >= 500){
            pos = 2;
        }
        else if(score >= 100){
            pos = 3;
        }
        return pos;
    }
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;
        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);
        highScore = calculateScore(true,10000, 8, 200);
        System.out.println("Your final score was " + highScore);


        int pos = CalculateHighScorePosition(1500);
        DisplayHighScorePosition("player 1", pos);

        pos = CalculateHighScorePosition(900);
        DisplayHighScorePosition("player 2", pos);

        pos = CalculateHighScorePosition(400);
        DisplayHighScorePosition("player 3", pos);

        pos = CalculateHighScorePosition(50);
        DisplayHighScorePosition("player 4", pos);


    }
}
