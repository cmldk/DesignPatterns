package Exercises2.factorymethod;

public class NYStyleVeggiePizza extends Pizza {


    @Override
    public void prepare() {
        System.out.println("NY Style Veggie Pizza is being prepared");
    }
}
