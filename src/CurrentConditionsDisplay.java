public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private WeatherData weatherData;

    public CurrentConditionsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update() {
        display();
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + weatherData.getTemperature()
                + "F degrees and " + weatherData.getHumidity() + "% humidity");
    }
}