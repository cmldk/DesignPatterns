package Exercises.observer.propertychange;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class NumberPublisher{

    NumberInfo info = new NumberInfo();

    PropertyChangeSupport support;

    public NumberPublisher() {
        support = new PropertyChangeSupport(this);
    }

    public void addObserver(PropertyChangeListener listener){
        support.addPropertyChangeListener(listener);
    }

    public void publishNumber(int num){
        info.setNum(num);
        support.firePropertyChange("views",null,info);
    }

    public int getNumber() {
        return info.getNum();
    }

}
