package lab5;

public class Task1 {
    public static void main(String[] args) {
        String text = "Flask provides a run command to run the application with a development server";
        System.out.println(longestWord(text));
    }

    public static String longestWord(String text) {
        String[] split = text.split(" ");
        String result = "";
        for (int i = 0; i < split.length; i++) {
            if (split[i].length() > result.length()) {
                result = split[i];
            }
        }
        return result;
    }
}
