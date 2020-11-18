package FactoryPattern;

public class NYStylePepperoniPizza extends Pizza{

    @Override
    public void prepare() {
        System.out.println("NY Style Pepperoni Pizza is being prepared");
    }

}
