package lessons.lesson05.Second;

public abstract class Question {
    String questionText;

    Question(String questionText) {
        this.questionText = questionText;
    }
    public String getQuestionText() {
        return questionText;
    }
    public abstract boolean checkAnswer(String userChoice);
    public abstract void showQuestion();
}
