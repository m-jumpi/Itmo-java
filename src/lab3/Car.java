package lab3;

public class Car {
    private Color color;
    private String model;
    private double weight;

    public Car() {
    }

    public Car(Color color) {
        this.color = color;
    }

    public Car(Color color, double weight) {
        this.color = color;
        this.weight = weight;
    }

    public Car(Color color, double weight, String model) {
        this.color = color;
        this.weight = weight;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                '}';
    }
}

class CarMain {
    public static void main(String[] args) {
        Car car1 = new Car(Color.BLACK, 50000, "BMW");
        System.out.println(car1);

        Car car2 = new Car(Color.WHITE, 40000, "Toyota");
        System.out.println(car2);
    }
}
