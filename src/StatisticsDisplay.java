public class StatisticsDisplay implements Observer, DisplayElement {
    private float temperature;

    public StatisticsDisplay(Subject weatherData) {
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        display();
    }

    @Override
    public void display() {
        System.out.println("Statistics: current temp " + temperature + "F");
    }
}