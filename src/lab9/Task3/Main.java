package lab9.Task3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map<User, Integer> map = new HashMap<>();
        map.put(new User("David"), 10);
        map.put(new User("John"), 20);
        map.put(new User("Fabian"), 22);
        System.out.println(getScore(map));
    }

    public static Integer getScore(Map<User, Integer> map) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter User name:");
        String name = scanner.next();
        Integer result = null;
        for (Map.Entry<User, Integer> pair : map.entrySet()) {
            User key = pair.getKey();
            Integer value = pair.getValue();

            if (key.getName().equals(name)) {
                result = value;
            }
        }
        return result;
    }
}
