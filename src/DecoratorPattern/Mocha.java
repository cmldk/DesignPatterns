package DecoratorPattern;

public class Mocha extends CondimentDecorator{

    public Mocha(Beverage beverage) {
        super(beverage);
        description = "Mocha";
    }

    @Override
    public int cost() {
        return 2 + beverage.cost();
    }
}
