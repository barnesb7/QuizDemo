package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class QuestionBank {

    Random random = new Random();

    List<QuizQuestion> questionBank;

    public QuestionBank(){
        questionBank = new ArrayList<>();
        questionBank.add(new QuizQuestion("What's your name", "Brian"));
    }

    public void addQuestion(QuizQuestion question){
        questionBank.add(question);
    }

    public void print(){
        System.out.println(questionBank);
    }


    public ArrayList<QuizQuestion> createQuestionSet(){

        ArrayList<QuizQuestion> questionSet = new ArrayList<>();

        for(int i = 0; i < 5; i++ ){
         QuizQuestion question = questionBank.get(random.nextInt(questionBank.size()));
         questionSet.add(question);
        }

        return questionSet;
    }

}
