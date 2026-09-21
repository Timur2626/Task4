import javax.swing.*;

public class CurrentConditionsDisplay implements WeatherListener {
    private final JLabel label;

    public CurrentConditionsDisplay(WeatherData data, JLabel label) {
        this.label = label;
        data.addWeatherListener(this);
    }

    @Override
    public void weatherChanged(WeatherEvent event) {
        label.setText("Current: " + event.getTemperature()
                + "F, " + event.getHumidity() + "%");
    }
}