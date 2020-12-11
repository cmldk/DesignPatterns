package Exercises.observer.myclasses;

import java.util.ArrayList;
import java.util.List;

public class NumberPublisher implements Subject {

    private int num;

    List<Observer> observers = new ArrayList<>();

    public void publishNumber(int num){
        this.num = num;
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer: observers){
            observer.update(num);
        }
    }

}
