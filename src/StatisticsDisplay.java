public class StatisticsDisplay implements IObserver, IDisplayElement {
    private float temperature;

    public StatisticsDisplay(ISubject weatherData) {
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