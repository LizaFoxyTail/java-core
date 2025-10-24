package lessons.lesson12.FuncInterface;

import java.util.Scanner;
import java.util.function.Consumer;

public class Four {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        Consumer<String> consumer = t -> System.out.println(t.toUpperCase());
        consumer.accept(text);
    }
}
