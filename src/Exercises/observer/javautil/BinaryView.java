package Exercises.observer.javautil;

import java.util.Observable;
import java.util.Observer;

public class BinaryView implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        NumberPublisher numberPublisher = (NumberPublisher) o;
        System.out.println(Integer.toBinaryString(numberPublisher.getNumber()));
    }

}