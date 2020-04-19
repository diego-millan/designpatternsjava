package patterns.observer;

public interface WeatherStationObserver {
    void update(float temperature, float humidity, float pressure);
}
