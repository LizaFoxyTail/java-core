package lessons.lesson12.FuncInterface;
import java.util.Scanner;
import java.util.function.Predicate;


public class One {
   public static void main(String[] args) {
    Predicate<String> predicate = s -> s.length() > 3 && !s.isEmpty();
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a string");
    String text = sc.nextLine();
    System.out.println(predicate.test(text));
    }
}
