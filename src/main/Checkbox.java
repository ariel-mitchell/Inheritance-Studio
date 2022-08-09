package main;

public class Checkbox extends Question {
    public Checkbox(String question, String answer) {
        super(question, answer);
    }

    @Override
    public boolean checkAnswer(String answer) {
        String actualAnswer = this.getTheAnswer();
        if (actualAnswer.toLowerCase().equals(answer.toLowerCase())) {
            return true;
        } else {
            return false;
        }
    }
}
