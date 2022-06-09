package lab11.Task4;


class MyThread extends Thread {
    private Object lock;

    public MyThread(Object object) {
        this.lock = object;

    }

    @Override
    public void run() {
        while (true) {
            synchronized (lock) {
                try {
                    System.out.println(Thread.currentThread().getName());
                    lock.notify();
                    lock.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }
        }
    }
}


