package lab11.Task1;

public class Main {
    public static void main(String[] args) {
        for (int j = 0; j < 10; j++) {
            new MyThread().start();
        }
    }
}
