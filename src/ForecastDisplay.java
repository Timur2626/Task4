public class ForecastDisplay implements IObserver, IDisplayElement {
    private WeatherData weatherData;

    public ForecastDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update() {
        display();
    }

    @Override
    public void display() {
        System.out.println("Forecast: pressure " + weatherData.getPressure() + " -> improving");
    }
}