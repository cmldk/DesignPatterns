package DecoratorPattern;

import java.util.ArrayList;
import java.util.List;

public class StarBazz {
    public static void main(String... args){

        List<Beverage> order = new ArrayList<>();
        order.add(new DarkRoast());
        order.add(new Milk(new HouseBlend()));
        order.add(new Mocha(new Mocha(new Espresso())));
        order.add(new Creme(new DarkRoast())); //New condiment creme

        int total = 0;
        for(Beverage beverage: order){
            System.out.println(beverage.getDescription() + " " + beverage.cost() + " TL");
            total += beverage.cost();
        }

        System.out.println(total);
    }
}
