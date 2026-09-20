public class StatisticsDisplay implements Observer, DisplayElement {
    private WeatherData weatherData;

    public StatisticsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update() {
        display();
    }

    @Override
    public void display() {
        System.out.println("Statistics: current temp " + weatherData.getTemperature() + "F");
    }
}