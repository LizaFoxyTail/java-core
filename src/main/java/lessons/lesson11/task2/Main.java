package lessons.lesson11.task2;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        SimpleThreadPool threadPool = new SimpleThreadPool(10);

        for(int i = 0; i < 30; i++) {
            int taskNum = i;
            threadPool.submit(() -> {
                System.out.println(taskNum + " is running by " + Thread.currentThread().getName());
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            });
        }
        Thread.sleep(4000);
        System.out.println("Tasks in queue - " + threadPool.getQueueSize());
        Thread.sleep(4000);
        System.out.println("Tasks in queue - " + threadPool.getQueueSize());
        threadPool.shutdown();
    }
}
