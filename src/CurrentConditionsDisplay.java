import javax.swing.*;

public class CurrentConditionsDisplay implements IObserver {
    private final WeatherData weatherData;
    private final JLabel label;

    public CurrentConditionsDisplay(WeatherData data, JLabel label) {
        this.weatherData = data;
        this.label = label;
        data.registerObserver(this);
    }

    @Override
    public void update() {
        // Сам берём данные из weatherData
        label.setText("Current: " + weatherData.getTemperature()
                + "F, " + weatherData.getHumidity() + "%");
    }
}