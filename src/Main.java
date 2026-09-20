public class Main {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay current = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statistics = new StatisticsDisplay(weatherData);
        ForecastDisplay forecast = new ForecastDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        System.out.println("---");
        weatherData.setMeasurements(82, 70, 29.2f);
    }
}