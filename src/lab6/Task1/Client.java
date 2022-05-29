package lab6.Task1;

public class Client extends Human {
    public String bankName;

    public Client(String name, String lastname, String bankName) {
        super(name, lastname);
        this.bankName = bankName;
    }

    @Override
    String getInfo() {
        return "Client{" +
                "name='" + super.getName() + '\'' +
                ", lastname='" + super.getLastname() + '\'' +
                ", bankName='" + bankName + '\'' +
                '}';
    }

    @Override
    public String greeting() {
        return "Hello, I'm client of the bank " + bankName;
    }
}
