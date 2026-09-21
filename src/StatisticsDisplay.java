import javax.swing.*;

public class StatisticsDisplay implements IObserver {
    private final WeatherData weatherData;
    private final JLabel label;

    public StatisticsDisplay(WeatherData data, JLabel label) {
        this.weatherData = data;
        this.label = label;
        data.registerObserver(this);
    }

    @Override
    public void update() {
        label.setText("Stats: " + weatherData.getTemperature() + "F");
    }
}