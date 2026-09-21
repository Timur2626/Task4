import java.util.ArrayList;
import java.util.List;

public class WeatherData {
    private final List<WeatherListener> listeners = new ArrayList<>();
    private float temperature;
    private float humidity;
    private float pressure;

    public void addWeatherListener(WeatherListener listener) {
        listeners.add(listener);
    }

    public void removeWeatherListener(WeatherListener listener) {
        listeners.remove(listener);
    }

    private void fireWeatherEvent() {
        WeatherEvent event = new WeatherEvent(this, temperature, humidity, pressure);
        for (WeatherListener listener : listeners) {
            listener.weatherChanged(event);
        }
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        fireWeatherEvent();
    }
}