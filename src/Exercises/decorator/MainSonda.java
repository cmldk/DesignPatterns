package Exercises.decorator;

import java.util.ArrayList;
import java.util.List;

public class MainSonda {
    public static void main(String... args){

        List<Car> order = new ArrayList<>();

        order.add(new Sunroof(new Airbag(new Sivic())));
        order.add(new ABS(new Airbag(new MusicSystem(new Sunroof(new Sity())))));

        int total = 0;
        for(Car car: order){
            System.out.println(car.getName() + "(" + car.getPrice() + ") --> (" + car.cost() + ")");
            total += car.cost();
        }
        System.out.println("Total Cost: " + total);
    }
}
