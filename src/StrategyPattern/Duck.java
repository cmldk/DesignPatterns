package StrategyPattern;

public abstract class Duck {

    protected FlyBehaviour flyBehaviour; //we can access them from the subclasses
    protected QuackBehaviour quackBehaviour;

    public void swim(){
        System.out.println("I am swimming");
    }

    public abstract void display();

    public void performFly(){
        flyBehaviour.fly();
    }

    public void performQuack(){
        quackBehaviour.quack();
    }

    public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }

    public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
        this.quackBehaviour = quackBehaviour;
    }
}
