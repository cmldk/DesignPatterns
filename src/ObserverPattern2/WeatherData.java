package ObserverPattern2;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.*;

public class WeatherData{

    WeatherInfo info = new WeatherInfo();

    PropertyChangeSupport support;

    public WeatherData() {
        support = new PropertyChangeSupport(this);
    }

    public void addObserver(PropertyChangeListener listener){
        support.addPropertyChangeListener(listener);
    }

    public int getTemperature() {
        return info.getTemperature();
    }

    public int getHumidity() {
        return info.getHumidity();
    }

    public int getPressure() {
        return info.getPressure();
    }

    public void setMeasurements(int temperature, int humidity, int pressure){
        info.setTemperature(temperature);
        info.setHumidity(humidity);
        info.setPressure(pressure);

        measurementsChanged();
    }

    public void measurementsChanged(){
        support.firePropertyChange("measurements",null, info);
    }
}
