package Exercises.decorator;

public class Sity extends Car{

    public Sity(){
        name = "Sity";
        price = 50000;
    }

    @Override
    public int cost() {
        return price;
    }
}
