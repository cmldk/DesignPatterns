package FactoryPattern;

public abstract class PizzaStore {

    protected abstract Pizza createPizza(String type); //factory method

    public Pizza orderPizza(String type){

        Pizza pizza = createPizza(type);

        if (pizza == null ) return null;

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}
