import javax.swing.*;

public class StatisticsDisplay implements WeatherListener {
    private final JLabel label;

    public StatisticsDisplay(WeatherData data, JLabel label) {
        this.label = label;
        data.addWeatherListener(this);
    }

    @Override
    public void weatherChanged(WeatherEvent event) {
        label.setText("Stats: " + event.getTemperature() + "F");
    }
}