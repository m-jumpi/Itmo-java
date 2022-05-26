package lab4;

public class Task11 {
    public static void main(String[] args) {
        oddNumbers();
    }

    public static void oddNumbers() {
        int i = 0;
        while (i < 100) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
            i++;
        }
    }
}
