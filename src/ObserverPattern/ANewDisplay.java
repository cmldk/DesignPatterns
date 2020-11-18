package ObserverPattern;

import java.util.Observable;
import java.util.Observer;

public class ANewDisplay implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        WeatherData wData = (WeatherData) o;
        System.out.println("New Display temperature = " + wData.getTemperature() + " humidity = " + wData.getHumidity() + " pressure = " + wData.getPressure());
    }
}
