package Exercises2.factorymethod;

public class NYPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;

        if (type.equals("cheese")){
            pizza = new NYStyleCheesePizza();
        }else if (type.equals("veggie")){
            pizza = new NYStyleVeggiePizza();
        }else{
            System.out.println("Error: invalid type of pizza");
            return null;
        }

        return pizza;
    }
}
