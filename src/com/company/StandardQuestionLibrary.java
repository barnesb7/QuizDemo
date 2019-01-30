package com.company;

import java.util.ArrayList;
import java.util.List;

public class StandardQuestionLibrary {

   private List<String> questionTextLibrary = new ArrayList<>();
   private  List<String> answerTextLibrary = new ArrayList<>();


    public void addQuestion(String questionText, String answerText){
        questionTextLibrary.add(questionText);
        answerTextLibrary.add(answerText);

        System.out.println(questionTextLibrary);
        System.out.println(answerTextLibrary);
    }

}
