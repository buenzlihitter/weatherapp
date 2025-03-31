public class ClothingRecommender {
    public String recommend(WeatherData data) {
        switch (data.getCondition()) {
            case "Rain": return "a rainjacket.";
            case "Snow": return "warm jacket and snowboots.";
            case "Clear": return "a tshirt and sunglasses";
            case "Clouds": return "a light jacket.";
            default: return "something flexible.";
        }
    }
}