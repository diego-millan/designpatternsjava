package patterns.observer;

import lombok.Data;

@Data
public class AtmosphericPressureDisplay implements WeatherStationObserver {
    private Subject subject;

    private float temperature;
    private float pressure;

    public AtmosphericPressureDisplay(Subject subject) {
        this.subject = subject;
        this.subject.addObserver(this);
    }

    public void display(){
        System.out.println( "Atmospheric Pressure: "+ calcPressaoAtmosferica() );
    }

    private String calcPressaoAtmosferica() {
        return String.valueOf(temperature * pressure);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.pressure = pressure;

        display();
    }
}
