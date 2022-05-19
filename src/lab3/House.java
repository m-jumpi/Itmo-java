package lab3;

import java.util.Calendar;

public class House {
    private int floors;
    private int year;
    private String title;

    public House() {
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int Age() {
        int year = Calendar.getInstance().get(Calendar.YEAR);
        return year - this.year;
    }

    public void houseBuilder(int floors, int year, String title) {
        setFloors(floors);
        setYear(year);
        setTitle(title);
    }

    @Override
    public String toString() {
        return "House{" +
                "floors=" + floors +
                ", year=" + year +
                ", title='" + title + '\'' +
                '}';
    }
}

class HouseMain {
    public static void main(String[] args) {
        House house1 = new House();
        house1.houseBuilder(10, 1990, "House1");
        System.out.println(house1);
        System.out.println(house1.Age());

        House house2 = new House();
        house2.houseBuilder(11, 2000, "House2");
        System.out.println(house2);
        System.out.println(house2.Age());
    }
}
