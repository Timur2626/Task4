public class CurrentConditionsDisplay implements IObserver, IDisplayElement {
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