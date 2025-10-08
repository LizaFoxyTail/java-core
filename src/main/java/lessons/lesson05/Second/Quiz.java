package lessons.lesson05.Second;
import java.util.Scanner;

public class Quiz {
    private String quizName;
    private Teams team1;
    private Teams team2;
    private Question[] questions = new Question[10];
    private int Questionnum;
    boolean team1Turn = true;

    public Quiz(String quizName, Teams team1, Teams team2){
        this.quizName = quizName;
        this.team1 = team1;
        this.team2 = team2;
    }

    public void AddQuestion(Question question){
        if (Questionnum < 10){
            questions[Questionnum] = question;
            Questionnum++;
        }
        else
            System.out.println("You can't add more questions");
    }

    public void StartQuiz() {
        System.out.println("Welcome to the Quiz" + quizName);
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < questions.length; i++){
            Question question = questions[i];
            System.out.println("Question " + (i + 1) + ":");
            question.showQuestion();

            System.out.println("The first team: " + team1.getName() + " your answer?");
            String answer1 = sc.nextLine();

            if (question.checkAnswer(answer1)) {
                System.out.println("The answer is correct!");
                team1.AddPoints(1);
                continue;
            }
            else {
                System.out.println("The answer is incorrect! Chance for the second team");
            }

            System.out.println("The second team: " + team2.getName() + " your answer?");
            String answer2 = sc.nextLine();

            if (question.checkAnswer(answer2)) {
                System.out.println("The answer is correct!");
                team2.AddPoints(1);
            }
            else {
                System.out.println("The answer is incorrect!");
            }

        }
    }


    public void showResults(){
        System.out.println("Team 1: " + team1.getName() + team1.getPoints() + "points");
        System.out.println("Team 2: " + team2.getName() + team2.getPoints() + "points");

        if (team1.getPoints() > team2.getPoints()){
            System.out.println("Team 1 won!");
        }
        else if (team1.getPoints() < team2.getPoints()){
            System.out.println("Team 2 won!");
        }
        else {
            System.out.println("Draw");
        }
        team1Turn = !team1Turn;
    }
}

