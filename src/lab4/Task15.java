package lab4;

import java.util.Arrays;

public class Task15 {
    public static void main(String[] args) {
        int[] intArray = new int[]{3, -3, 7, 4, 5, 4, 3};
        containThree(intArray);
    }

    public static void containThree(int[] intArray) {
        if (intArray[0] == 3 || intArray[intArray.length - 1] == 3) {
            System.out.println("true");
        }
    }
}
