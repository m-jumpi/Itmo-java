package lab4;

public class Task21 {
    public static void main(String[] args) {
        int[] intArray = new int[]{1, 2, 3, 4, 5, 6, 7};
        System.out.println(isOrdered(intArray));
    }

    public static String isOrdered(int[] intArray) {
        int minValue = Integer.MIN_VALUE;
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] > minValue) {
                minValue = intArray[i];
            } else {
                return "Please, try again";
            }
        }
        return "Ok";
    }
}
