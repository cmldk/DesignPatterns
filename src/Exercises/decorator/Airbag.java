package Exercises.decorator;

public class Airbag extends Decorator{

    public Airbag(Car car) {
        super(car);
        name = "Airbag";
        price = 3000;
    }

    @Override
    public int cost() {
        return price + car.cost();
    }
}
