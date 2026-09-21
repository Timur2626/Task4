import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Weather Station - Listener + Event");
            frame.setLayout(new GridLayout(4, 1));

            JLabel currentLabel = new JLabel("Current: --");
            JLabel statsLabel = new JLabel("Stats: --");
            JLabel forecastLabel = new JLabel("Forecast: --");

            WeatherData weatherData = new WeatherData();

            // Подписка через addWeatherListener — как addActionListener у кнопки
            new CurrentConditionsDisplay(weatherData, currentLabel);
            new StatisticsDisplay(weatherData, statsLabel);
            new ForecastDisplay(weatherData, forecastLabel);

            JButton button = new JButton("Set measurements");
            button.addActionListener(e -> {
                weatherData.setMeasurements(
                        (float)(Math.random() * 40 + 60),
                        (float)(Math.random() * 40 + 40),
                        (float)(Math.random() * 5 + 28));
            });

            frame.add(currentLabel);
            frame.add(statsLabel);
            frame.add(forecastLabel);
            frame.add(button);

            frame.setSize(400, 200);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}