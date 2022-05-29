package lab6.Task3;

public class Track extends Car {
    public int wheels;
    public int maxWeight;

    public Track(int w, String m, char c, float s, int wheels, int maxWeight) {
        super(w, m, c, s);
        this.wheels = wheels;
        this.maxWeight = maxWeight;
    }

    public Track(int wheels, int maxWeight) {
        this.wheels = wheels;
        this.maxWeight = maxWeight;
    }

    public void newWheels(int wheels) {
        this.wheels = wheels;
        System.out.println(wheels);
    }

    @Override
    public String toString() {
        return "Track{" +
                "wheels=" + wheels +
                ", maxWeight=" + maxWeight +
                ", weight=" + weight +
                ", model='" + model + '\'' +
                ", color=" + color +
                ", speed=" + speed +
                '}';
    }
}
