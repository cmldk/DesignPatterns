package Exercises2.factorymethod;

public class ChicagoStyleVeggiePizza extends Pizza {


    @Override
    public void prepare() {
        System.out.println("Chicago Style Veggie Pizza is being prepared");
    }
}
