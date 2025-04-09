import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LocationServiceMockTest {

    @Test
    public void testGetCurrentLocationAarau() {
        LocationServiceMock mockLocationService = new LocationServiceMock("Aarau");
        String location = mockLocationService.getCurrentLocation();

        assertEquals("Aarau", location);
    }

    @Test
    public void testGetCurrentLocationBaden() {
        LocationServiceMock mockLocationService = new LocationServiceMock("Baden");
        String location = mockLocationService.getCurrentLocation();

        assertEquals("Baden", location);
    }

    @Test
    public void testLocationServiceForEmptyLocation() {
        LocationServiceMock mockLocationService = new LocationServiceMock("");
        String location = mockLocationService.getCurrentLocation();

        assertEquals("", location);  // Erwartet leeren String als Rückgabe
    }

}
