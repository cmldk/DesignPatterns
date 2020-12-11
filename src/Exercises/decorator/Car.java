package Exercises.decorator;

public abstract class Car {

    protected String name;
    protected int price;

    public abstract int cost();

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
