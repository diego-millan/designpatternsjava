package patterns.observer;

import lombok.Data;

@Data
public class AverageDisplay implements WeatherStationObserver{

    private Subject subject;

    private float minimumTemperature, maximumTemperature, averageTemperature;
    private float minimumHumidity, maximumHumidity, averageHumidity;
    private float minimumPressure, maximumPressure, averagePressure;

    public AverageDisplay(Subject subject) {
        this.subject = subject;
        this.subject.addObserver(this);
    }

    public void display(){
        System.out.println("Average Temperature: "+ averageTemperature);
        System.out.println("Average Humidity: "+ averageHumidity);
        System.out.println("Average Pressure: "+ averagePressure);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        updateAverageTemperature(temperature);
        updateAverageHumidity(humidity);
        updateAveragePressure(pressure);

        display();
    }

    private void updateAveragePressure(float pressure) {
    }

    private void updateAverageHumidity(float humidity) {
    }

    private void updateAverageTemperature(float temperature) {
    }
}