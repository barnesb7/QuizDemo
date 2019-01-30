package com.company;

import java.util.ArrayList;
import java.util.List;

public class StandardQuestionLibrary {

    private List<String> questionTextLibrary = new ArrayList<>();
    private List<String> answerTextLibrary = new ArrayList<>();

    public StandardQuestionLibrary() {

        addQuestion("What color is the sky?", "blue");
        addQuestion("What city is Detroit Labs located in?", "Detroit");
        addQuestion("What US State is Detroit in?", "Michigan");
        addQuestion("What's the best dog breed?", "Corgi");
        addQuestion("What's the best food?", "Taco");
        addQuestion("What's the best country or territory?", "Guam");
        addQuestion("What's the best sound?", "Blaaaah!!");
    }

    public void addQuestion(String questionText, String answerText){
        questionTextLibrary.add(questionText);
        answerTextLibrary.add(answerText);

    }

    public List<QuizQuestion> getLibraryAsQuizQuestions(){

        List<QuizQuestion> standardLibraryAsQuizQuestions = new ArrayList<>();

        for(int i = 0; i < questionTextLibrary.size(); i++){
            standardLibraryAsQuizQuestions.add(new QuizQuestion(questionTextLibrary.get(i), answerTextLibrary.get(i)));
        }

        return  standardLibraryAsQuizQuestions;
    }

}
