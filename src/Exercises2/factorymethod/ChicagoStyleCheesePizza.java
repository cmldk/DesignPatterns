package Exercises2.factorymethod;

public class ChicagoStyleCheesePizza extends Pizza {


    @Override
    public void prepare() {
        System.out.println("Chicago Style Cheese Pizza is being prepared");
    }
}
