package com.dogfighter.game;

/**
 * Created by Anders on 2017-12-25.
 */

public class Score {


    private int score ;
    private int cleared_obstacle;

    public Score() {
        this.score = 0;
        cleared_obstacle = 1;
    }

    public void addScore() {
        this.score += cleared_obstacle;
        System.out.print("score is: " + score);
    }

    public String getScore() {
        System.out.print("been in getscore....");
        return "Score: " + score;
    }
}
