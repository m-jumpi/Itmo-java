package lab2;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.sum(2, 2));
        System.out.println(calc.sum(2.0, 4.0));
        System.out.println(calc.sum(9L, 3L));

        Book book = new Book("java", "author1", "orealy", 500, 2000);
        System.out.println(book);
    }
}