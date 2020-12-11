package Exercises.decorator;

public class Sunroof extends Decorator{

    public Sunroof(Car car) {
        super(car);
        name = "Sunroof";
        price = 2000;
    }

    @Override
    public int cost() {
        return price + car.cost();
    }
}
