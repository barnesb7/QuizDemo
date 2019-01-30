package com.company;

import java.util.ArrayList;
import java.util.List;

public class QuestionBank {

    List<QuizQuestion> questionBank = new ArrayList<>();


    public void addQuestion(QuizQuestion question){
        questionBank.add(question);
    }

}
