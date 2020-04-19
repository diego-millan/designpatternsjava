package patterns.observer;

public interface Subject {
    public void addObserver(WeatherStationObserver observer);
    public void removeObserver(WeatherStationObserver observer);
    public void notifyObservers();
}