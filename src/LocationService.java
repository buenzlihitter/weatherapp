import java.util.Scanner;

public class LocationService {
    public String getCurrentLocation() {
        Scanner weatherLocation = new Scanner(System.in);
        System.out.print("Wo befindest du dich?: ");
        String location = weatherLocation.nextLine(); // Lese den Standort des Benutzers
        return location; // Gib den Standort zurück
    }
}
