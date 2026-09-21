import javax.swing.*;

public class ForecastDisplay implements WeatherListener {
    private final JLabel label;

    public ForecastDisplay(WeatherData data, JLabel label) {
        this.label = label;
        data.addWeatherListener(this);
    }

    @Override
    public void weatherChanged(WeatherEvent event) {
        label.setText("Forecast: " + event.getPressure());
    }
}