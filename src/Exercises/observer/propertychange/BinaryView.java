package Exercises.observer.propertychange;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class BinaryView implements PropertyChangeListener {

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        NumberInfo numberInfo = (NumberInfo) evt.getNewValue();
        System.out.println(Integer.toBinaryString(numberInfo.getNum()));
    }

}