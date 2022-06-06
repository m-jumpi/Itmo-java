package lab6.Task5;

import java.util.Scanner;

public class Parent {
    private Scanner scanner = new Scanner(System.in);
    public int age;

    public String getScanner() {
        return scanner.next();
    }

    public void field() {
        System.out.println("Enter you age: ");
        this.age = scanner.nextInt();
    }

    public void getInfo() {
        System.out.println("Age: " + age);
    }
}
