import javax.swing.event.EventListenerList;

public class WeatherData {
    private EventListenerList listenerList = new EventListenerList();
    private float temperature;
    private float humidity;
    private float pressure;

    public void addWeatherListener(WeatherListener listener) {
        listenerList.add(WeatherListener.class, listener);
    }

    public void removeWeatherListener(WeatherListener listener) {
        listenerList.remove(WeatherListener.class, listener);
    }

    public void fireWeatherChanged() {
        WeatherEvent event = new WeatherEvent(this, temperature, humidity, pressure);
        WeatherListener[] listeners = listenerList.getListeners(WeatherListener.class);
        for (WeatherListener listener : listeners) {
            listener.weatherChanged(event);
        }
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        fireWeatherChanged();
    }
}