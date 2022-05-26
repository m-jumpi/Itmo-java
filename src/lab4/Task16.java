package lab4;

public class Task16 {
    public static void main(String[] args) {
        int[] intArray = new int[]{0, 0, 7, 4, 5, 4, 3};
        System.out.println(containOneOrThree(intArray));
    }

    public static boolean containOneOrThree(int[] intArray) {
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] == 1 || intArray[i] == 3) {
                return true;
            }
        }
        return false;
    }
}
