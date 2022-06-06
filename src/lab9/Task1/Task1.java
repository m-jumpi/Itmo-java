package lab9.Task1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Task1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("Go");
        list.add("C#");
        list.add("C#");
        list.add("Java");
        list.add("Python");
        System.out.println(doubleFree(list));
    }

    public static List<String> doubleFree(List<String> strings) {
        Set<String> set = new HashSet<>();
        for (String string : strings) {
            set.add(string);
        }
        strings.clear();
        for (String string : set) {
            strings.add(string);
        }
        return strings;
    }
}
