package com.company;

public class UserMenu {

    final String NEWLINE = "\n";
    private String initialPrompt = "What would you like to do? ";
    private String takeQuizOption = "[1] Take quiz";
    private String addNewQuestionOption = "[2] Add new question";
    private String getNewQuestionsOption = "[3] Get different questions";
    private String exitOption = "[4] Exit program";

    public void showMenu(){
        System.out.println(initialPrompt + NEWLINE
                         + takeQuizOption + NEWLINE
                         + addNewQuestionOption + NEWLINE
                         + getNewQuestionsOption + NEWLINE
                         + exitOption);
    }


}
