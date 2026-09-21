import javax.swing.*;

public class ForecastDisplay implements IObserver {
    private final WeatherData weatherData;
    private final JLabel label;

    public ForecastDisplay(WeatherData data, JLabel label) {
        this.weatherData = data;
        this.label = label;
        data.registerObserver(this);
    }

    @Override
    public void update() {
        label.setText("Forecast: " + weatherData.getPressure());
    }
}