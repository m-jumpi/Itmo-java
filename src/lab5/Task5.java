package lab5;

import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {
        String text = "This is a test string";
        System.out.println(reverce(text));
    }

    public static StringBuilder reverce(String text) {
        String[] split = text.split(" ");
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < split.length; i++) {
            builder.append(new StringBuilder(split[i]).reverse()).append(" ");
        }
        return builder;
    }
}
