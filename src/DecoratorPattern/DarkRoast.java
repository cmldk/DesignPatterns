package DecoratorPattern;

public class DarkRoast extends Beverage{

    public DarkRoast() {
        description = "DarkRoast";
    }

    @Override
    public int cost() {
        return 7;
    }
}
