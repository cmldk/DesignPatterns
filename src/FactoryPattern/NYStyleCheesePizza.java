package FactoryPattern;

public class NYStyleCheesePizza extends Pizza{

    @Override
    public void prepare() {
        System.out.println("NY Style Cheese Pizza is being prepared");
    }
}
