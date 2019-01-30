package com.company;

public class CreateNewQuestionHandler {

    QuestionBuilder questionBuilder = new QuestionBuilder();
    StandardQuestionLibrary standardQuestionLibrary = new StandardQuestionLibrary();

    public void createNewQuestion(){
       QuizQuestion newQuestion = questionBuilder.buildNewQuestion();

       standardQuestionLibrary.addQuestion(newQuestion.getQuestionText(), newQuestion.getAnswer());

    }

}
