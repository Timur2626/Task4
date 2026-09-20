public class ForecastDisplay implements WeatherListener {
    public ForecastDisplay(WeatherData weatherData) {
        weatherData.addWeatherListener(this);
    }

    @Override
    public void weatherChanged(WeatherEvent e) {
        System.out.println("Forecast: pressure " + e.getPressure() + " -> improving");
    }
}