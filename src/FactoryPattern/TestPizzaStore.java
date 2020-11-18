package FactoryPattern;

public class TestPizzaStore {
    public static void main(String... args){

        //SimplePizzaFactory factory = new SimplePizzaFactory();
        //PizzaStore pizzaStore = new PizzaStore(factory);
        //pizzaStore.orderPizza("cheese");


        NYPizzaStore nps = new NYPizzaStore();
        nps.orderPizza("cheese");

        ChicagoPizzaStore cps = new ChicagoPizzaStore();
        cps.orderPizza("cheese");

    }
}
