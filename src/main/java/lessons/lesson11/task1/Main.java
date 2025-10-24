package lessons.lesson11.task1;

import java.util.LinkedList;
import java.util.Queue;


public class Main {
    public static void main(String[] args) throws InterruptedException {
        Queue<String> wordsQueue =  new LinkedList<>();

        Publisher publisher = new Publisher(wordsQueue);
        Subscriber subscriber = new Subscriber(wordsQueue);

        publisher.start();
        subscriber.start();

    }
}
