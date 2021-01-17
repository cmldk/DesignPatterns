package Exercises2.factorymethod;

public class TestPizzaStore {
    public static void main(String... args){

        NYPizzaStore nyPizzaStore = new NYPizzaStore();
        nyPizzaStore.orderPizza("veggie");

        System.out.println("\n");
        ChicagoPizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
        chicagoPizzaStore.orderPizza("cheese");
        chicagoPizzaStore.orderPizza("invalid type");


    }
}
