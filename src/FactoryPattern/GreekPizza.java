package FactoryPattern;

public class GreekPizza extends Pizza{

    @Override
    public void prepare() {
        System.out.println("Greek Pizza is being prepared");
    }
}
