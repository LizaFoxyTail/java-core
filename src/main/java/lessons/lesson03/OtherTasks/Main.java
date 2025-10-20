package lessons.lesson03.OtherTasks;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //__________________________________________________//
        Person person1 = new Person("Иван", 25);
        person1.introduce();

        Person person2 = new Person("Людмила", 30);
        person2.introduce();
        //__________________________________________________//
        System.out.print("Введите длину прямоугольника: ");
        double length = in.nextDouble();
        System.out.print("Введите ширину прямоугольника: ");
        double width = in.nextDouble();

        Rectangle rectangle = new Rectangle(length, width);
        System.out.println("Площадь: " + rectangle.CalculateSquare());
        System.out.println("Периметр: " + rectangle.CalculatePerimeter());
        //__________________________________________________//
        System.out.println("Введите страну, модель и год выпуска: ");
        String country = in.nextLine();
        String model = in.nextLine();
        int year = in.nextInt();
        Car car1 = new Car(country, model, year);
        car1.printCarInfo();
        //__________________________________________________//
        BankAccount account = new BankAccount("Иванов Иван", 1, 1000);
        account.deposit();
        account.withdraw();
        account.withdraw();
        System.out.println("Текущий баланс: " + account.GetBalance());
    }
}