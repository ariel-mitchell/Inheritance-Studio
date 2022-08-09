package main;

public class MultipleChoice extends Question {

    public MultipleChoice(String question, String answer) {
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
