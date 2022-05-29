package lab6.Task5;

public class Child extends Parent {

    @Override
    public void name() {
        System.out.println("Enter you name (child class): ");
        super.name=super.scanner.next();
//        super.name();
    }
}
