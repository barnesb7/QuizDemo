package com.company;

import java.util.Scanner;

public class QuestionBuilder {

    Scanner scan = new Scanner(System.in);

    public QuizQuestion buildNewQuestion(){

        System.out.println("What is the question text?");
        String userInputQuestionText = scan.nextLine();

        System.out.println("What is the answer to: " + userInputQuestionText);
        String userInputAnswerText = scan.nextLine();

        return new QuizQuestion(userInputQuestionText, userInputAnswerText);

    }

}
