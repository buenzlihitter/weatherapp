import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class WeatherServiceMockTest {

    @Test
    public void testGetWeatherForAarau() {
        WeatherServiceMock mockService = new WeatherServiceMock();
        WeatherData data = mockService.getWeather("Aarau");

        assertEquals(15.0, data.getTemperature(), 0.1);
        assertEquals("Clear", data.getCondition());
    }

    @Test
    public void testGetWeatherForInvalidLocation() {
        WeatherServiceMock mockService = new WeatherServiceMock();
        WeatherData data = mockService.getWeather("InvalidCity");

        // Überprüfe, dass Standardwerte zurückgegeben werden
        assertEquals(0.0, data.getTemperature(), 0.1);
        assertEquals("Unknown", data.getCondition());
    }
}
