package lab9.Task2;


import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();
        addElements(list2);
        randomElement(list2);
    }

    public static void addElements(List<Integer> list) {
        for (int i = 0; i <= 1000000; i++) {
            list.add(i);
        }
    }

    public static void randomElement(List<Integer> list) {
        Long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
//            System.out.println(list.get((int) ((Math.random() * (100000 - 0)) + 0)));
            list.get((int) ((Math.random() * (100000 - 0)) + 0));
        }
        Long end = System.currentTimeMillis();
        System.out.println("Elapsed time in milli seconds: " + (end - start));
    }
}
