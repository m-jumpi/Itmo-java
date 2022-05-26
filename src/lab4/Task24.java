package lab4;


import java.util.Arrays;

public class Task24 {
    public static void main(String[] args) {
        int[] intArray = new int[]{1, 2, 3, 1, 2, 4};
        unique(intArray);
    }

    public static void unique(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println(arr[i]);
                break;
            }
        }
    }
}