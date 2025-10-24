package lessons.lesson11.task2;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class SimpleThreadPool {
    private Queue<Runnable> tasksQueue;
    private int threadNum;
    private final List<MyTread> myThread;
    volatile boolean running = true; //флаг работы пула с модификатором volatile, чтобы потоки читали его из основной памяти и не было ошибок

    public SimpleThreadPool(int threadNum) {
        this.threadNum = threadNum;
        this.tasksQueue = new LinkedList<>();
        this.myThread = new LinkedList<>();

        for (int i = 0; i < threadNum; i++) {
            MyTread thread = new MyTread("MyThread" + i);
            myThread.add(thread);
            thread.start(); //чтобы каждый поток выполнялся независимо
        }
    }

    public void submit(Runnable task) {
        synchronized (tasksQueue) {
            tasksQueue.add(task);
            tasksQueue.notify();
        }
    }
    public int getQueueSize() {  //решила сделать отдельный метод, чтобы проверять, остаются ли задания в очереди, если потоки заняты
        synchronized (tasksQueue) {
            return tasksQueue.size();
        }
    }

    public void shutdown() {
        synchronized (tasksQueue) {
            running = false;
            tasksQueue.notifyAll();
        }
    }

    private class MyTread extends Thread { //отдельный класс для реализации работы каждого потока
        public MyTread(String name) {
            super(name);
        }

        @Override
        public void run() {
            while (true) {
                Runnable task;

                synchronized (tasksQueue) {
                    while (tasksQueue.isEmpty() && running) { //если очередь пустая, но при этом пул работает, мы будем ждать
                        try {
                            tasksQueue.wait();
                        } catch (InterruptedException e) {
                            System.out.println(e.getMessage());
                            return;
                        }
                    }
                    if (tasksQueue.isEmpty() && !running) { //если очередь пустая и пул остановлен, выход из цикла
                        System.out.println("Thread " + Thread.currentThread().getName() + " was stopped");
                        break;
                    }

                    task = tasksQueue.poll();
                }

                try {  //вытащила run из synchronized, чтобы один поток не блокировал всю очередь во время выполнения своего задания
                    task.run();
                    System.out.println(Thread.currentThread().getName() + " Ending his task ");
                }
                catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}
