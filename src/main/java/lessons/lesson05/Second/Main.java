package lessons.lesson05.Second;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Team 1 please enter your Team Name");
        String teamName1 = sc.nextLine();
        Teams team1 = new Teams(teamName1, 0);

        System.out.println("Team 2 please enter your Team Name");
        String teamName2 = sc.nextLine();
        Teams team2 = new Teams(teamName2, 0);

        Quiz quiz1 = new Quiz("General questions", team1, team2);
        quiz1.AddQuestion(new TrueFalseQuestions("The Earth is flat? ", false));
        quiz1.AddQuestion(new OpenQuestion("The capital of France ? ", "Paris"));
        quiz1.AddQuestion(new OpenQuestion("What is the chemical symbol for water?", "H2O"));
        quiz1.AddQuestion(new TrueFalseQuestions("Basketball was invented in the USA.", true));
        quiz1.AddQuestion(new OpenQuestion("What is 12 multiplied by 8?", "96"));
        quiz1.AddQuestion(new TrueFalseQuestions("Albert Einstein developed the theory of relativity.", true));
        quiz1.AddQuestion(new OpenQuestion("Which planet is known as the Red Planet?", "Mars"));
        quiz1.AddQuestion(new OpenQuestion("Who wrote 'Hamlet'?", "William Shakespeare"));
        quiz1.AddQuestion(new OpenQuestion("Which movie won the Oscar for Best Picture in 1994?", "Forrest Gump"));
        quiz1.AddQuestion(new OpenQuestion("Which instrument has keys, pedals, and strings?", "Piano"));
        quiz1.StartQuiz();
        quiz1.showResults();
    }
}
