package lessons.lesson11.task1;

import java.util.Queue;

public class Subscriber extends Thread {
    private final Queue<String> wordsQueue; //Создала такую же очередь с конструктором
    public Subscriber(Queue<String> wordsQueue) {
        this.wordsQueue = wordsQueue;
    }
    public void run() {  // в методе так же синхронизировала с первым потоком и освободила монитор привязав его к тому, пустая очередь или нет.
        while (true) {
            String part;

            synchronized (wordsQueue) { //тоже добавила здесь notify, чтобы переключаться между потоками
                while (wordsQueue.isEmpty()) {
                    try {
                        wordsQueue.wait();
                    } catch (InterruptedException e)
                    {
                        e.printStackTrace();
                    }
                }
                part = wordsQueue.poll();

                if (wordsQueue.isEmpty()) {
                    wordsQueue.notify();
                }
            }

            if (part.equalsIgnoreCase("exit")) {
                return;
            }
            System.out.println("The word has been deleted from the queue");
        }
    }
}

