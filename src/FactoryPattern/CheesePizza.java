package FactoryPattern;

public class CheesePizza extends Pizza{

    @Override
    public void prepare() {
        System.out.println("Cheese Pizza is being prepared");
    }
}
