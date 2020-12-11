package Exercises.decorator;

public class ABS extends Decorator{

    public ABS(Car car) {
        super(car);
        name = "Autamatic Breaking System";
        price = 5000;
    }

    @Override
    public int cost() {
        return price + car.cost();
    }
}
