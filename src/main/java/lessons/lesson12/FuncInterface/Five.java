package lessons.lesson12.FuncInterface;

import java.util.Scanner;
import java.util.function.BiFunction;

public class Five {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        BiFunction<Integer,Integer,Integer> biFunction = (x,y)->x+y;
        System.out.println(biFunction.apply(a,b));
    }
}
