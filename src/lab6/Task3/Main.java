package lab6.Task3;

public class Main {
    public static void main(String[] args) {
        Track track = new Track(6, "CAT", 'B', 80, 6, 1200);
        System.out.println(track);
        track.newWheels(8);
        System.out.println(track);
    }
}
