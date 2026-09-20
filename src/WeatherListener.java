import java.util.EventListener;

public interface WeatherListener extends EventListener {
    void weatherChanged(WeatherEvent e);
}