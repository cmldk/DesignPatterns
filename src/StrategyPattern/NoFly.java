package StrategyPattern;

public class NoFly implements FlyBehaviour {
    public void fly(){
        System.out.println("I can not fly");
    }
}
