import java.util.EventObject;

public class WeatherEvent extends EventObject {
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherEvent(Object source, float temperature, float humidity, float pressure) {
        super(source);
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
    }

    public float getTemperature() { return temperature; }
    public float getHumidity() { return humidity; }
    public float getPressure() { return pressure; }
}