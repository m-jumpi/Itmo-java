package lab11.Task2;

class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("hello");
        Thread.State state = currentThread().getState();
        System.out.println(state);
    }
}
