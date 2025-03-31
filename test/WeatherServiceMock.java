public class WeatherServiceMock extends WeatherService {
    @Override
    public WeatherData getWeather(String location) {
        // Hier simulieren wir verschiedene Rückgaben für unterschiedliche Orte
        if ("Aarau".equalsIgnoreCase(location)) {
            return new WeatherData(15.0, "Clear", 50, 5.0);  // Beispielwerte
        } else if ("Baden".equalsIgnoreCase(location)) {
            return new WeatherData(12.5, "Clouds", 70, 3.0);  // Beispielwerte
        } else {
            // Statt einer Exception zurückgeben wir einen Standardwert oder null
            return new WeatherData(0.0, "Unknown", 0, 0);  // Kein gefundenes Wetter
        }
    }
}
