public class LocationServiceMock extends LocationService {
    private String location;

    public LocationServiceMock(String location) {
        this.location = location;  // Erlaubt es, einen Standort beim Erstellen der Mock-Instanz zu setzen
    }

    @Override
    public String getCurrentLocation() {
        return location;  // Gibt den simulierten Standort zurück
    }
}
