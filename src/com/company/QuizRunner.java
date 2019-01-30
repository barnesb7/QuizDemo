package com.company;

import java.util.List;
import java.util.Scanner;

public class QuizRunner {

    private Quiz currentQuiz;
    Scanner scan = new Scanner(System.in);
    String userInput;


    public QuizRunner(Quiz quiz){
        currentQuiz = quiz;
    }

    public void takeCurrentQuiz(){

        List<QuizQuestion> currentQuizQuestionSet = currentQuiz.getQuizQuestionSet();

        for(int i = 0; i < currentQuizQuestionSet.size(); i++){

            System.out.println(currentQuizQuestionSet.get(i).getQuestionText());
            userInput = scan.nextLine();

            if(userInput.equals(currentQuizQuestionSet.get(i).getAnswer())){
                currentQuiz.adjustScore("increase");
                System.out.println("Correct! your new score is " + currentQuiz.getCurrentScore() );

            } else {
                System.out.println("The correct answer was " + currentQuizQuestionSet.get(i).getAnswer());
                currentQuiz.adjustScore("decrease");
                System.out.println("Your current score is " + currentQuiz.getCurrentScore());
            }
        }
        System.out.println("You have completed the quiz with a score of " + currentQuiz.getCurrentScore());
    }



}
