package Exercises.decorator;

public abstract class Decorator extends Car{

    protected Car car;

    public Decorator(Car car) {
        this.car = car;
    }

    public String getName() {
        return car.getName() + "(" + car.getPrice() + ") + " + name ;
    }

}
