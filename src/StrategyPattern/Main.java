package StrategyPattern;

public class Main {
    public static void main(String... args){

        MallardDuck mallardDuck = new MallardDuck();
        mallardDuck.display();
        mallardDuck.performQuack();
        mallardDuck.swim();
        mallardDuck.performFly();
        System.out.println("\n");

        //mallard duck was shooted
        mallardDuck.setFlyBehaviour(new NoFly());
        mallardDuck.display();
        mallardDuck.performQuack();
        mallardDuck.swim();
        mallardDuck.performFly();
        System.out.println("\n");

        RedHeadDuck redHeadDuck = new RedHeadDuck();
        redHeadDuck.display();
        redHeadDuck.performQuack();
        redHeadDuck.swim();
        redHeadDuck.performFly();
        System.out.println("\n");

        //this is meaningless so we create superclass as an abstract class
        //Duck duck = new Duck();

        RubberDuck rubberDuck = new RubberDuck();
        rubberDuck.display();
        rubberDuck.performQuack();
        rubberDuck.swim();
        rubberDuck.performFly();
        System.out.println("\n");

        DecoyDuck decoyDuck = new DecoyDuck();
        decoyDuck.display();
        decoyDuck.performQuack();
        decoyDuck.swim();
        decoyDuck.performFly();
        System.out.println("\n");

        ModelDuck modelDuck = new ModelDuck();
        modelDuck.display();
        modelDuck.performQuack();
        modelDuck.swim();
        modelDuck.performFly();

        //After rocket powered
        modelDuck.setFlyBehaviour(new FlyRocketPowered());
        modelDuck.performFly();
    }
}
