package lab4;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        sumTwo();
    }

    public static void sumTwo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value a:");
        int a = scanner.nextInt();
        System.out.println("Enter value b:");
        int b = scanner.nextInt();
        System.out.println("Enter value c:");
        int c = scanner.nextInt();
        if (a + b == c) {
            System.out.println("true");
        }
    }
}
