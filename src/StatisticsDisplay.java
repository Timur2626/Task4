import java.util.Observable;
import java.util.Observer;

public class StatisticsDisplay implements Observer {
    private Observable observable;
    private float temperature;
    private float minTemp = Float.MAX_VALUE;
    private float maxTemp = Float.MIN_VALUE;

    public StatisticsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this); // подписка
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            this.temperature = weatherData.getTemperature();
            if (temperature < minTemp) minTemp = temperature;
            if (temperature > maxTemp) maxTemp = temperature;
            display();
        }
    }

    public void display() {
        System.out.println("Statistics: avg/min/max temp = " + temperature
                + "F / " + minTemp + "F / " + maxTemp + "F");
    }
}