package DecoratorPattern;

public class Whip extends CondimentDecorator{

    public Whip(Beverage beverage) {
        super(beverage);
        description = "Whip";
    }

    @Override
    public int cost() {
        return 4 + beverage.cost();
    }
}
