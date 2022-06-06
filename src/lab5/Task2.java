package lab5;

public class Task2 {
    public static void main(String[] args) {
        String string = "Tenet";
        System.out.println(polindrom(string));
    }

    public static boolean polindrom(String string) {
        String rstring = new StringBuilder(string).reverse().toString();
        return (string.equalsIgnoreCase(rstring));
    }
}
