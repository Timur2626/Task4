import java.util.ArrayList;
import java.util.List;

public class WeatherData implements ISubject {
    private List<IObserver> observers = new ArrayList<>();
    private float temperature;
    private float humidity;
    private float pressure;

    @Override
    public void registerObserver(IObserver o) { observers.add(o); }

    @Override
    public void removeObserver(IObserver o) { observers.remove(o); }

    @Override
    public void notifyObservers() {
        for (IObserver o : observers) {
            o.update();
        }
    }

    public void setMeasurements(float t, float h, float p) {
        this.temperature = t;
        this.humidity = h;
        this.pressure = p;
        notifyObservers();
    }

    public float getTemperature() { return temperature; }
    public float getHumidity() { return humidity; }
    public float getPressure() { return pressure; }
}