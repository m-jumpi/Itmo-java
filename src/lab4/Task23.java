package lab4;

import java.util.Arrays;

public class Task23 {
    public static void main(String[] args) {
        int[] intArray = new int[]{1, 0, 7, 4, 5, 4, 3};
        swap(intArray);
    }

    public static void swap(int[] intArray) {
        int first = intArray[0];
        int last = intArray[intArray.length - 1];
        System.out.println("Array 1: " + Arrays.toString(intArray));
        intArray[0] = last;
        intArray[intArray.length - 1] = first;
        System.out.println("Array 2: " + Arrays.toString(intArray));
    }
}
