package lab6.Task5;

public class Child extends Parent {
    private String name;

    @Override
    public void field() {
        System.out.println("Enter you name: ");
        name = super.getScanner();
    }

    @Override
    public void getInfo() {
        System.out.println("Name: " + name);
    }
}
