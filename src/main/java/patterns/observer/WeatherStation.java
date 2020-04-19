package patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject {

    private List<WeatherStationObserver> observers;

    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherStation() {
        this.observers = new ArrayList<>();
    }

    public void setMeditions(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;

        notifyObservers();
    }

    @Override
    public void addObserver(WeatherStationObserver observer) {
        this.observers.add(observer);
    }

    @Override
    public void removeObserver(WeatherStationObserver observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (WeatherStationObserver observer : observers) {
            observer.update(this.temperature, this.humidity, this.pressure);
        }
    }
}
