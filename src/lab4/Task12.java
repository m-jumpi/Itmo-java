package lab4;

public class Task12 {
    public static void main(String[] args) {
        divThreeFive();
    }

    public static void divThreeFive() {
        int i = 1;
        while (i < 100) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + " Is divided by 3");
                System.out.println(i + " Is divided by 5");
                System.out.println(i + " Is divided by 3 and 5");
            } else if (i % 3 == 0) {
                System.out.println(i + " Is divided by 3");
            } else if (i % 5 == 0) {
                System.out.println(i + " Is divided by 5");
            }
            i++;
        }
    }
}
