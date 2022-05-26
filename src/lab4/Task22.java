package lab4;

import java.util.Arrays;
import java.util.Scanner;

public class Task22 {
    public static void main(String[] args) {
        initArray();
    }

    public static void initArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Array length:");
        int x = scanner.nextInt();
        int[] intArray = new int[x];
        System.out.println("Numbers of array:");

        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = scanner.nextInt();
        }
        System.out.println("Result: " + Arrays.toString(intArray));
    }
}
