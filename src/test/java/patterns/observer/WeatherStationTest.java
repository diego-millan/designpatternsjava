package patterns.observer;

import org.junit.Assert;
import org.junit.Test;

public class WeatherStationTest {

    public static final double DELTA = 0.0002;

    @Test
    public void whenChangeWeatherThenUpdateDisplays() {

        WeatherStation weatherStation = new WeatherStation();

        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherStation);
        AverageDisplay averageDisplay = new AverageDisplay(weatherStation);
        AtmosphericPressureDisplay atmosphericPressureDisplay = new AtmosphericPressureDisplay(weatherStation);

        weatherStation.setMeditions(87, 47, 14.4f);

        Assert.assertEquals(statisticsDisplay.getTemperature(), 87f, DELTA);
        Assert.assertEquals(statisticsDisplay.getHumidity(), 47f, DELTA);
        Assert.assertEquals(atmosphericPressureDisplay.getPressure(), 14.4f, DELTA);

        weatherStation.setMeditions(91, 23, 108.2f);

        Assert.assertEquals(statisticsDisplay.getTemperature(), 91f, DELTA);
        Assert.assertEquals(statisticsDisplay.getHumidity(), 23f, DELTA);
        Assert.assertEquals(atmosphericPressureDisplay.getPressure(), 108.2f, DELTA);

        weatherStation.setMeditions(65, 30, 41.2f);

        Assert.assertEquals(statisticsDisplay.getTemperature(), 65f, DELTA);
        Assert.assertEquals(atmosphericPressureDisplay.getPressure(), 41.2f, DELTA);
    }
}
