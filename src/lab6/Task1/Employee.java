package lab6.Task1;

public class Employee extends Human {
    public String bankName;

    public Employee(String name, String lastname, String bankName) {
        super(name, lastname);
        this.bankName = bankName;
    }

    @Override
    public String getInfo() {
        return "Employee{" +
                "name='" + super.getName() + '\'' +
                ", lastname='" + super.getLastname() + '\'' +
                ", bankName='" + bankName + '\'' +
                '}';
    }

    @Override
    public String greeting() {
        return "Hello, I'm working in the bank " + bankName;
    }
}
