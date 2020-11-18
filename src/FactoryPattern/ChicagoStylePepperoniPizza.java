package FactoryPattern;

public class ChicagoStylePepperoniPizza extends Pizza{

    @Override
    public void prepare() {
        System.out.println("Chicago Style Pepperoni Pizza is being prepared");
    }

}
