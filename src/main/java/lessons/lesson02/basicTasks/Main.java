package lessons.lesson02.basicTasks;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PrintNums();
        CountNums();
        Multiply();
        CountEvenNumbers();
        SumOfDigitsOfNumber();
        Reverse();
        FindNum();
        printSimple();

    }

    public static void PrintNums() {
        System.out.println("1 task");
        for (int i = 1; i <= 100; i++) {
            System.out.print(i + " "); //выводит каждое число без переноса на следующую строчку и через пробел
            if (i % 10 == 0) {
                System.out.println();
            }
        }
    }

    public static void CountNums() {
        System.out.println("2 task");
        int sum = 0;
        System.out.println("Enter a final num");
        Scanner in = new Scanner(System.in);
        int target = in.nextInt();
        for (int i = 1; i <= target; i++) {
            sum += i;
        }
        System.out.println("Sum = " + sum);
    }

    public static void Multiply() {
        System.out.println("3 task");
        System.out.println("Enter a number");
        int mul = 1;
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();

        for (int i = 1; i <= number; i++) {
            mul *= i;
        }
        System.out.println("Multiply num = " + mul);
    }

    public static void CountEvenNumbers() {
        System.out.println("4 task");
        int sum = 0;
        System.out.println("Enter a final number");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println("sum of all even numbers = " + sum);
    }

    public static void SumOfDigitsOfNumber() {
        System.out.println("5 task");
        int num = 1234;
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num = num / 10;

        }
        System.out.println("Sum of digits of a number = " + sum);
    }

    public static void Reverse() {
        System.out.println("6 task");
        int OriginNum = 1234;
        int digit = 0;
        int FinalNum = 0;
        while (OriginNum > 0) {
            digit = OriginNum % 10;
            FinalNum = FinalNum * 10 + digit;
            OriginNum = OriginNum / 10;

        }
        System.out.println("Reverse number = " + FinalNum);
    }

    public static void FindNum() {
        System.out.println("8 task");
        int target = 0;
        int start = 1000;
        if (start % 7 == 0) {  // если число делится на 7 без остатка, берем следующее, которое кратно семи
            target = start + 7;
        } else {
            target = start + (7 - start % 7);  // если не делится, то из 7 вычитаем остаток от деления и добавляем к стартовому числу
        }
        System.out.println("The first number that is divisible by 7 " + target);
    }

    public static void printSimple() {
        System.out.println("9 task");
        System.out.println("Enter a number");
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int num;
        for (num = 2; num <= N; num++) {
            boolean simple = true;
            for (int i = 2; i * i <= num; i++) {
                if (num % i == 0) {
                    simple = false;
                    break;
                }
            }
            if (simple) {
                System.out.print(num + " ");
            }
        }
    }

}
