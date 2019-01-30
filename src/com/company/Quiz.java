package com.company;

import java.util.ArrayList;
import java.util.List;

public class Quiz {

    private List<QuizQuestion> quizQuestionSet;
    private ScoreKeeper scoreKeeper;
    private QuestionBank questionBank;

    public Quiz(){
        this.questionBank = new QuestionBank();
       ArrayList<QuizQuestion> questionSet = this.questionBank.createQuestionSet();

        this.quizQuestionSet = new ArrayList(questionSet);
        this.scoreKeeper = new ScoreKeeper();
    }

    public void getDifferentQuestions(){
        quizQuestionSet = questionBank.createQuestionSet();
    }

    public void addToQuestionBank(QuizQuestion quizQuestion){
        questionBank.addQuestion(quizQuestion);
    }

    public List<QuizQuestion> getQuizQuestionSet(){
        return quizQuestionSet;
    }

    public void printQuestionBank(){
        questionBank.print();
    }

    public void adjustScore(String adjustment){
        if(adjustment.equals("increase")){
            scoreKeeper.increaseScore();
        } else if (adjustment.equals("decrease")){
            scoreKeeper.decreaseScore();
        }
    }

    public int getCurrentScore(){
        return scoreKeeper.getQuizScore();
    }
}
