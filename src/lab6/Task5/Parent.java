package lab6.Task5;

import java.util.Scanner;

public class Parent {
    Scanner scanner = new Scanner(System.in);
    public String name;
    public int age;

    public void name() {
        System.out.println("Enter you name: ");
        this.name = scanner.next();
    }

    public void age() {
        System.out.println("Enter you age: ");
        this.age = scanner.nextInt();
    }

    @Override
    public String toString() {
        return "Parent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
