package lessons.lesson02.OtherTasks;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SwapNums();
        MultiplicationTable();
        CurrencyConverter();
        EvenOrOdd();
        MaximumOfThree();
        Calculator();
    }
    public static void SwapNums() {
        System.out.println("First task");
        System.out.println("Enter 1st number");
        Scanner first = new Scanner(System.in);
        int FirstNum = first.nextInt();
        System.out.println("Enter 2nd number");
        Scanner second = new Scanner(System.in);
        int SecondNum = second.nextInt();
        int EmptyBox;
        EmptyBox = SecondNum;
        SecondNum = FirstNum;
        FirstNum = EmptyBox;
        System.out.println("The first number = " + FirstNum);
        System.out.println("The second number = " + SecondNum);
    }
    public static void MultiplicationTable() {
        System.out.println("Second task");
        System.out.println("Enter a number you want to multiply"); //программа выводит таблицу умножения на любой случай, который нужен пользователю
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        for (int i = 1; i <=10; i++){
            System.out.println(num + " * "+ i + " = " + num * i);
        }
    }
    public static void CurrencyConverter(){
        System.out.println("Third task");
        int exchange = 12500;
        System.out.println("Enter a sum you want to convert (in dollars)");
        Scanner in = new Scanner(System.in);
        float value = in.nextInt();
        float converted = exchange*value;
        System.out.println("The converted sum is " + converted);
    }

    public static void EvenOrOdd(){
        System.out.println("Forth task");
        System.out.println("Enter a number");
        Scanner in = new Scanner(System.in);;
        int num = in.nextInt();
        if (num % 2 == 0){
            System.out.println("The number is even");
        }
        else{
            System.out.println("The number is odd");
        }
    }
    public static void MaximumOfThree(){
        System.out.println("Fifth task");
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a first number");
        int first = in.nextInt();
        System.out.println("Enter a second number");
        int second = in.nextInt();
        System.out.println("Enter a third number");
        int third = in.nextInt();

        int max = first;
        if (second>max) {
            max = second;
        }
        if (third>max) {
            max = third;
        }
        System.out.println("The maximum is " + max);
    }
    public static void Calculator(){
        System.out.println("Six task");
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a first number");
        double first = in.nextDouble();
        System.out.println("Enter a second number");
        double second = in.nextDouble();
        System.out.println("Enter an operator");
        char operation = in.next().charAt(0);
        double result;
        switch (operation){
            case '+':
                result = first + second;
                System.out.println("Result = " + result);
                break;
            case '-':
                result = first - second;
                System.out.println("Result = " + result);
                break;
            case '*':
                result = first * second;
                System.out.println("Result = " + result);
                break;
            case '/':
                if (second != 0) {
                    result = first / second;
                    System.out.println("Result = " + result);
                }
                else{
                    System.out.println("Invalid operation");
                }
                break;
            default:
                System.out.println("Invalid operation");
        }

    }

}
