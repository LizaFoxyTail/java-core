package lessons.lesson05.Second;

public class OpenQuestion extends Question {
    private String correctAnswer;

    OpenQuestion(String questionText, String correctAnswer) {
        super(questionText);
        this.correctAnswer = correctAnswer.toUpperCase();
    }
    @Override
    public boolean checkAnswer(String userChoice){
        return userChoice.trim().equalsIgnoreCase(correctAnswer.trim());
    }
    @Override
    public  void showQuestion(){
        System.out.println(questionText);
        System.out.println("Enter your correct answer");
    }
}