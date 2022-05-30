package lab7;

public class Plane {
    public void setWing(double weight) {
        Plane.Wing wing = new Plane.Wing();
        wing.weight = weight;
        wing.displayWeight();
    }

    class Wing {
        public double weight;

        public void displayWeight() {
            System.out.println(weight);
        }
    }

    public static void main(String[] args) {
        Plane plane1 = new Plane();
        plane1.setWing(10);

        Plane plane2 = new Plane();
        plane2.setWing(20);
    }
}
