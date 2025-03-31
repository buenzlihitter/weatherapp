import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class WeatherService {
    private static final String API_KEY = "911e13beaea802b9be6133b4bc291103";
    private static final String BASE_URL = "https://api.openweathermap.org/data/2.5/weather";

    public WeatherData getWeather(String location) {
        try {
            String urlString = BASE_URL + "?q=" + location + "&appid=" + API_KEY + "&units=metric&lang=de";
            URL url = new URL(urlString);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");

            BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            StringBuilder response = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                response.append(line);
            }
            reader.close();

            String json = response.toString();

            double temp = Double.parseDouble(extract(json, "\"temp\":", ","));
            String condition = extract(json, "\"main\":\"", "\"");
            int humidity = Integer.parseInt(extract(json, "\"humidity\":", ","));
            double windSpeed = Double.parseDouble(extract(json, "\"speed\":", "\n"));

            return new WeatherData(temp, condition, humidity, windSpeed);
        } catch (Exception e) {
            System.out.println("Fehler beim Abrufen der Wetterdaten: " + e.getMessage());
            return new WeatherData(0, "Unknown", 0, 0);
        }
    }

    private String extract(String json, String start, String end) {
        int begin = json.indexOf(start);
        if (begin == -1) return "";
        begin += start.length();
        int finish = json.indexOf(end, begin);
        if (finish == -1) return json.substring(begin);
        return json.substring(begin, finish);
    }
}