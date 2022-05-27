package lab5;

public class Task3 {
    public static void main(String[] args) {
        String text = "Flask provides a run command to run the application with a development server";
        String oldWord = "a";
        String newWord = "the";
        System.out.println(replace(text, oldWord, newWord));
    }

    public static String replace(String text, String oldWord, String newWord) {
        return text.replace(oldWord, newWord);
    }
}
