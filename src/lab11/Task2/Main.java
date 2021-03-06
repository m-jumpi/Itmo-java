package lab11.Task2;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread myThread = new MyThread();

        Thread.State state = myThread.getState();
        System.out.println(state);

        myThread.start();
        state = myThread.getState();
        System.out.println(state);

        myThread.join();
        state = myThread.getState();
        System.out.println(state);
    }
}
