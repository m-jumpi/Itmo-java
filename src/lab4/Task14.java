package lab4;

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        isIncrease();
    }

    public static void isIncrease(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value a:");
        int a = scanner.nextInt();
        System.out.println("Enter value b:");
        int b = scanner.nextInt();
        System.out.println("Enter value c:");
        int c = scanner.nextInt();
        if (b > a && c > b) {
            System.out.println("true");
        }
    }
}
