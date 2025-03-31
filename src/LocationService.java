import java.util.Scanner;

public class LocationService {
    public String getCurrentLocation() {
        Scanner weatherLocation = new Scanner(System.in);
        System.out.print("Where are you at?: ");
        String location = weatherLocation.nextLine(); // Lese den Standort des Benutzers
        return location; // Gib den Standort zurück
    }
}
