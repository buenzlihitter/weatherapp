import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ClothingReminderTest {
    @Test
    void testClothingRecommendationForClearWeather() {
        WeatherData data = new WeatherData(25.0, "Clear", 50, 5.0);  // Temperatur: 25°C, Zustand: "Clear"
        ClothingRecommender recommender = new ClothingRecommender();

        String recommendation = recommender.recommend(data);

        assertEquals("a tshirt and sunglasses", recommendation);  // Erwartete Empfehlung bei sonnigem Wetter
    }

    @Test
    public void testClothingRecommendationForRain() {
        WeatherData data = new WeatherData(10.0, "Rain", 80, 12.0);  // Temperatur: 10°C, Zustand: "Rain"
        ClothingRecommender recommender = new ClothingRecommender();

        String recommendation = recommender.recommend(data);

        assertEquals("a rainjacket.", recommendation);  // Erwartete Empfehlung bei Regen
    }

    @Test
    public void testClothingRecommendationForSnow() {
        WeatherData data = new WeatherData(-5.0, "Snow", 90, 15.0);  // Temperatur: -5°C, Zustand: "Snow"
        ClothingRecommender recommender = new ClothingRecommender();

        String recommendation = recommender.recommend(data);

        assertEquals("warm jacket and snowboots.", recommendation);  // Erwartete Empfehlung bei Schnee
   }

}