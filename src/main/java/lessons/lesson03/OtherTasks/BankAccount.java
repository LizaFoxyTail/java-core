package lessons.lesson03.OtherTasks;

import java.util.Scanner;

public class BankAccount {
    String fio;
    int AccountNumber;
    double balance;

    public BankAccount(String fio, int AccountNumber, double balance) {
        this.fio = fio;
        this.AccountNumber = AccountNumber;
        this.balance = balance;
    }

    public void deposit(){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите сумму для пополнения: ");
        double amount = in.nextDouble();

        if (amount > 0){
            balance += amount;
            System.out.println("На счет зачислено: " + amount +  "Новый баланс: " + balance);
        }
        else {
            System.out.println("Сумма пополнения должна быть положительной");
        }
    }

    public void withdraw(){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите сумму для вывода: ");
        double amount = in.nextDouble();

        if (amount > 0 && balance >= amount){
            balance -= amount;
            System.out.println("Со счета снято " + amount +  "Новый баланс: " + balance);
        }
        else {
            System.out.println("Недостаточно средств");
        }
    }

    public double GetBalance(){
        return balance;
    }

}

