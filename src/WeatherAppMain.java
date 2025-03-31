import java.util.Scanner;

public class WeatherAppMain {
    public static void main(String[] args) {
        LocationService locationService = new LocationService();
        WeatherService weatherService = new WeatherService();
        ClothingRecommender recommender = new ClothingRecommender();

        String location = locationService.getCurrentLocation();
        WeatherData weather = weatherService.getWeather(location);
        String recommendation = recommender.recommend(weather);

        System.out.println("Wetter für " + location + ":");
        System.out.println("Temperatur: " + weather.getTemperature() + "°C");
        System.out.println("Zustand: " + weather.getCondition());
        System.out.println("Empfehlung: " + recommendation);
    }
}