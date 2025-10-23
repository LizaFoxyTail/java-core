package lessons.lesson12.FuncInterface;

import java.util.Scanner;
import java.util.function.Function;

public class Six {
    public static void main(String[] args) {
        Function<String, String> trim = String::trim;
        Function<String, String> upper = String::toUpperCase;
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
//        Function<String, String> result = trim.andThen(upper); //как альтернативный вариант
//        System.out.println(result.apply(text));
        System.out.println(trim.andThen(upper).apply(text));
    }
}
