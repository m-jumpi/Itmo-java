package lab6.Task1;

import lab6.Task2.Greeting;

public abstract class Human implements Greeting {
    private String name;
    private String lastname;

    public Human(String name, String lastname) {
        this.name = name;
        this.lastname = lastname;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    abstract String getInfo();
}
