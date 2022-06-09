package lab11.Task3;

public class Task3 {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        tenThreads(counter);
        System.out.println(counter.getCount());
    }

    public static void tenThreads(Counter counter) throws InterruptedException {
        class MyThread extends Thread {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    counter.increment();
                }
            }
        }
        for (int j = 0; j < 100; j++) {
//            new MyThread().start();
            Thread myThread = new MyThread();
            myThread.start();
//            Thread.sleep(1);
            myThread.join();
        }
    }
}
