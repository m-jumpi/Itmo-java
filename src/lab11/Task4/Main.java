package lab11.Task4;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Object lock=new Object();
        Thread thread1 = new MyThread(lock);
        thread1.start();
        Thread thread2 = new MyThread(lock);
        thread2.start();
    }
}
