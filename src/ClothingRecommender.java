public class ClothingRecommender {
    public String recommend(WeatherData data) {
        switch (data.getCondition()) {
            case "Rain": return "Zieh eine Regenjacke an.";
            case "Snow": return "Warme Kleidung und Schneestiefel sind nötig.";
            case "Clear": return "T-Shirt und Sonnenbrille sind ideal.";
            case "Clouds": return "Eine leichte Jacke genügt.";
            default: return "Zieh dich flexibel an.";
        }
    }
}