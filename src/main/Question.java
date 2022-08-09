package main;

public abstract class Question {
    private final String question;
    private final String answer;

    public Question(String question, String answer) {
        this.question = question;
        this.answer = answer;
    }

    public abstract boolean checkAnswer(String answer);

    public String getTheQuestion() {
        return question;
    }

    public String getTheAnswer() {
        return answer;
    }
}
