package com.company;

import java.util.Scanner;

public class QuizDemo {

    public static void main(String[] args) {

        UserMenu userMenu = new UserMenu();
        Scanner scan = new Scanner(System.in);

        final String takeQuiz = "1";
        final String addNewQuestion = "2";
        final String getDifferentQuestions = "3";
        final String exitProgram = "4";

        userMenu.showMenu();
        String userInput =  scan.nextLine();

        if(userInput.equals(takeQuiz)){

        } else if (userInput.equals(addNewQuestion)){

        } else if (userInput.equals(getDifferentQuestions)){

        } else if (userInput.equals(exitProgram)){

        } else {

        }


    }
}
