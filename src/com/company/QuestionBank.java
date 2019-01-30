package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class QuestionBank {

    StandardQuestionLibrary standardQuestionLibrary = new StandardQuestionLibrary();
    Random random = new Random();

    List<QuizQuestion> questionBank;

    public QuestionBank(){
        questionBank = new ArrayList<>(standardQuestionLibrary.getLibraryAsQuizQuestions());
    }

    public void addQuestion(QuizQuestion question){
        questionBank.add(question);
    }

    public void print(){
        System.out.println(questionBank);
    }

    public ArrayList<QuizQuestion> createQuestionSet(){

        ArrayList<QuizQuestion> questionSet = new ArrayList<>();

        ArrayList<Integer> randomIndexesAlreadyCalled = new ArrayList<>();

        for(int i = 0; i < 5; i++ ){

         int randomNumber = random.nextInt(questionBank.size());
         randomIndexesAlreadyCalled.add(randomNumber);


         QuizQuestion question = questionBank.get(random.nextInt(questionBank.size()));
         questionSet.add(question);
        }

        return questionSet;
    }

}
