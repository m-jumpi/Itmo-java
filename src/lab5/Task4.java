package lab5;

public class Task4 {
    public static void main(String[] args) {
        String s1 = "Flask provides a run command to run the application with a development server";
        String s2 = "run";
        System.out.println(substringCount(s1, s2));
    }

    public static int substringCount(String s1, String s2) {
        String[] split = s1.split(" ");
        int count = 0;
        for (int i = 0; i < split.length; i++) {
            if (split[i].equals(s2)) {
                count++;
            }
        }
        return count;
    }
}
