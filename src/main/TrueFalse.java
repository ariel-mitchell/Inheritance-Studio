package main;

public class TrueFalse extends Question {

    public TrueFalse(String question, String answer) {
        super(question, answer);
    }

    public boolean checkAnswer(String answer) {
        if (this.getTheAnswer().toLowerCase().equals(answer.toLowerCase())) {
            return true;
        } else {
            return false;
        }
    }
}

