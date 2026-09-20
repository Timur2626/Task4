public class ForecastDisplay implements Observer, DisplayElement {
    private float pressure;

    public ForecastDisplay(Subject weatherData) {
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.pressure = pressure;
        display();
    }

    @Override
    public void display() {
        System.out.println("Forecast: pressure " + pressure + " -> improving");
    }
}