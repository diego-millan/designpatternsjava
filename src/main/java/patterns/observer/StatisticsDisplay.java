package patterns.observer;

import lombok.Data;

@Data
public class StatisticsDisplay implements WeatherStationObserver {

    private Subject subject;
    private float temperature;
    private float humidity;
    private float pressure;

    public StatisticsDisplay( Subject subject ){
        this.subject = subject;
        this.subject.addObserver( this );
    }

    private void display(){
        System.out.println("Temperature: "+ temperature);
        System.out.println("Humidity: "+ humidity);
        System.out.println("Pressure: "+ pressure);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;

        display();
    }
}
