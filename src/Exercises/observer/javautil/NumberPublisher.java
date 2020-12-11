package Exercises.observer.javautil;

import java.util.Observable;

public class NumberPublisher extends Observable{

    private int num;

    public void publishNumber(int num){
        this.num = num;
        setChanged();
        notifyObservers();
    }

    public int getNumber() {
        return num;
    }

}
