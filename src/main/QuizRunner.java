package main;

public class QuizRunner {
    public static void main(String[] args) {
        Quiz myQuiz = new Quiz();

        myQuiz.addQuestion(new TrueFalse("Raleigh and Rowan are sisters. \n True/False", "True"));
        myQuiz.addQuestion(new MultipleChoice("What is Rowan's favorite food? \nA. Plum \nB. Avocado \nC. Sweet Potato \nD. Mango \nEnter a letter: ", "A"));
        myQuiz.addQuestion(new Checkbox("What does Raleigh like to do at the park? \nA. Go down the slide \nB. Jump/Bounce \nC. Swing \nD. Play in the sandbox \nE. Play with wood chips \nF. Walk the paths \nEnter all letters that apply, separated by commas: ", "B,D,E"));

        myQuiz.runQuiz();

    }
}
