package com.company;

public class ScoreKeeper {

    private int quizScore = 0;


    public void increaseScore(){
        quizScore += 1;
    }


    public void decreaseScore(){
        quizScore -= 1;
    }

    public int getQuizScore() {
        return quizScore;
    }

    public void setQuizScore(int quizScore) {
        this.quizScore = quizScore;
    }
}
