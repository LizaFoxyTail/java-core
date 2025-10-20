package lessons.lesson05.Second;

public class TrueFalseQuestions extends Question {
    private boolean correctAnswer;

    public TrueFalseQuestions(String questionText, boolean correctAnswer) {
        super(questionText);
        this.correctAnswer = correctAnswer;
    }
    @Override
    public boolean checkAnswer(String userChoice){
        if (userChoice.equals("1"))
            return correctAnswer == true;

        else if (userChoice.equals("2"))
            return correctAnswer == false;

        else
            return false;
    }
    @Override
    public void showQuestion(){
        System.out.println(getQuestionText());
        System.out.println("1 - Да \n 2 - Нет ");
    }
}