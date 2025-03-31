 // WeatherData.java
    public class WeatherData {
        private double temperature;
        private String condition;
        private int humidity;
        private double windSpeed;

        // Konstruktor, Getter, Setter
        public WeatherData(double temperature, String condition, int humidity, double windSpeed) {
            this.temperature = temperature;
            this.condition = condition;
            this.humidity = humidity;
            this.windSpeed = windSpeed;
        }

        public double getTemperature() { return temperature; }
        public String getCondition() { return condition; }
        public int getHumidity() { return humidity; }
        public double getWindSpeed() { return windSpeed; }
    }

