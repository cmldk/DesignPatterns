package Exercises.decorator;

public class Sivic extends Car{

    public Sivic(){
        name = "Sivic";
        price = 40000;
    }

    @Override
    public int cost() {
        return price;
    }
}
