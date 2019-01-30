package com.company;

public class CreateNewQuestionHandler {

    QuestionBuilder questionBuilder = new QuestionBuilder();
    StandardQuestionLibrary standardQuestionLibrary = new StandardQuestionLibrary();

    public QuizQuestion createNewQuestion(){
       QuizQuestion newQuestion = questionBuilder.buildNewQuestion();

       addQuestionToStandardQuestionLibrary(newQuestion);

       return newQuestion;
    }

    private void addQuestionToStandardQuestionLibrary(QuizQuestion newQuestion){
        standardQuestionLibrary.addQuestion(newQuestion.getQuestionText(), newQuestion.getAnswer());
    }

}
