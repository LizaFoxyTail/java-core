package lessons.lesson12.FuncInterface;

import java.util.Scanner;
import java.util.function.Function;

public class Two {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String text = sc.nextLine();
       System.out.println("Enter a string");
       Function<String,Integer> function = t -> text.length();
       System.out.println(function.apply(text));
    }
}
