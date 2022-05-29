package lab6.Task1;

public class Main {
    public static void main(String[] args) {
        printHumanInfo(new Client("David", "Smith", "City"));
        printHumanInfo(new Employee("Roy", "Alen", "Chase"));
    }

    public static void printHumanInfo(Human human) {
        System.out.println(human.getInfo());
    }
}
