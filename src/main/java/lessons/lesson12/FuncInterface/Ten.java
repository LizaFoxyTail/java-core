package lessons.lesson12.FuncInterface;

import java.util.Scanner;
import java.util.function.UnaryOperator;

public class Ten {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        UnaryOperator<String> unary = t -> t + "!!!";
        System.out.println(unary.apply(text));
    }
}
