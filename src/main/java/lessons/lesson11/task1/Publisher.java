package lessons.lesson11.task1;

import java.util.Arrays;
import java.util.Queue;
import java.util.Scanner;

public class Publisher extends Thread {
    private final Queue<String> wordsQueue; //создала очередь и конструктор к ней

    public Publisher(Queue<String> wordsQueue) {
        this.wordsQueue = wordsQueue;
    }

    public void run() { // переписала run так, чтобы он работал постоянно, принимал от пользователя массив слов. Потом синхронизировала два потока по общей очереди, чтобы они обращались к одним данным.
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Enter your word");
            String line = sc.nextLine();

            if (line == null || line.trim().isEmpty()) continue; //проверка на пустую строку, введенную пользователем
            String[] parts = line.trim().split("\\s+");

            synchronized (wordsQueue) { //пришлось добавить два wait и notify, потому что появлялось наложение в работе потоков и новый запрос к пользователю выходил раньше, чем все слова вытаскивались из очереди
                for (String part : parts) {
                    wordsQueue.add(part);
                }
                wordsQueue.notify();
                System.out.println("The word " + Arrays.toString(parts) + " has been added to the queue");

                try {
                    while (!wordsQueue.isEmpty()) { //сделала так, чтобы Паблишер ждал пока очередь не освободится и только потом запускал запрос к пользователю
                        wordsQueue.wait();
                    }
                } catch (InterruptedException e){
                    e.printStackTrace();
                }
            }

            for (String part : parts) {
                if (part.equalsIgnoreCase("exit")) {
                    return; // вместо System.exit(0) сделала return, чтобы не было жесткого обрыва программы
                }
            }
        }
    }
}

