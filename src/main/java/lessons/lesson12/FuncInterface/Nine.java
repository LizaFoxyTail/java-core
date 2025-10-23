package lessons.lesson12.FuncInterface;

import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Nine {
    public static void main(String[] args) {
        System.out.println("Enter numbers");
        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();
        int second = sc.nextInt();
        BiFunction<Integer, Integer, Integer> multiply = (a,b)->{return a*b;};
        Function<Integer, String> toString = (x)->"Result: " +x;
        BiFunction<Integer, Integer, String> result = multiply.andThen(toString); //не получилось написать сразу в принт, поэтому сделала отдельно совмещенную
        System.out.println(result.apply(first,second));
    }
}
