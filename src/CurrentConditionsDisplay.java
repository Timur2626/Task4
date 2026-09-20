public class CurrentConditionsDisplay implements WeatherListener {
    public CurrentConditionsDisplay(WeatherData weatherData) {
        weatherData.addWeatherListener(this);
    }

    @Override
    public void weatherChanged(WeatherEvent e) {
        System.out.println("Current conditions: " + e.getTemperature()
                + "F degrees and " + e.getHumidity() + "% humidity");
    }
}