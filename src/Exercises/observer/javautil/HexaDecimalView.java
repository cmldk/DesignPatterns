package Exercises.observer.javautil;

import java.util.Observable;
import java.util.Observer;

public class HexaDecimalView implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        NumberPublisher numberPublisher = (NumberPublisher) o;
        System.out.println(Integer.toHexString(numberPublisher.getNumber()));
    }
}