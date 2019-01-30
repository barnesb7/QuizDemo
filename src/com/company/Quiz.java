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
}
