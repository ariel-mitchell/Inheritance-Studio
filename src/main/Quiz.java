package main;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {

    private ArrayList<Question> questions = new ArrayList<>();
    private int correctAnswers = 0;
    private Scanner scanner = new Scanner(System.in);
    //Add Questions
    //Run Quiz
    //Grade Quiz

    public void addQuestion(Question question) {
        this.questions.add(question);
    }

    public void runQuiz() {
        //Loop through questions
        for (Question question : questions) {
            //Ask question
            System.out.println(question.getTheQuestion());
            //Accept user input
            String userInput = this.getUserInput();
            //Check answer
            boolean gotAnswerCorrect = question.checkAnswer(userInput);
            if (gotAnswerCorrect) {
                correctAnswers++;
            }
        }
        //Grade Quiz
        double userGrade = (((double) correctAnswers) / ((double) this.questions.size())) * 100;
        System.out.println("Your grade is " + userGrade + "%!");
    }

    private String getUserInput() {
        String userInput = scanner.nextLine();
        return userInput;
    }
}