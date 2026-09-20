public class StatisticsDisplay implements WeatherListener {
    public StatisticsDisplay(WeatherData weatherData) {
        weatherData.addWeatherListener(this);
    }

    @Override
    public void weatherChanged(WeatherEvent e) {
        System.out.println("Statistics: current temp " + e.getTemperature() + "F");
    }
}