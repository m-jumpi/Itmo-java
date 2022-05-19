package lab1;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int bc = scanner.nextInt();
        if (bc % 2 == 0 && bc > 100) {
            System.out.println("Out of range");
        } else if (bc % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}
