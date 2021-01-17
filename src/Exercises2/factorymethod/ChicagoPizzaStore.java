package Exercises2.factorymethod;

public class ChicagoPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;

        if (type.equals("cheese")){
            pizza = new ChicagoStyleCheesePizza();
        }else if (type.equals("veggie")){
            pizza = new ChicagoStyleVeggiePizza();
        }else{
            System.out.println("Error: invalid type of pizza");
            return null;
        }

        return pizza;
    }
}
