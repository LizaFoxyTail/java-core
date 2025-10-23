package lessons.lesson12.FuncInterface;

import java.util.Scanner;
import java.util.function.Predicate;

public class Eight {
    public static void main(String[] args) {
        System.out.println("Enter number");
        Scanner sc = new Scanner(System.in);
        int a  = sc.nextInt();
        Predicate<Integer> isEven = x -> x % 2 == 0;
        Predicate<Integer> isPositive = x -> x > 0;

        Predicate<Integer> result = isEven.negate().or(isPositive.negate());
        System.out.println(result.test(a));
    }
}
