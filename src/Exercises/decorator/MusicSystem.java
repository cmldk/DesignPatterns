package Exercises.decorator;

public class MusicSystem extends Decorator{

    public MusicSystem(Car car) {
        super(car);
        name = "Music System";
        price = 1000;
    }

    @Override
    public int cost() {
        return price + car.cost();
    }
}
