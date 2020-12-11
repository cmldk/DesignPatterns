package Exercises.strategy;

public class Main {
    public static void main(String... args){

        Soldier soldier = new Soldier("Captain Price");

        soldier.setAttackBehaviour(new Gun());
        soldier.setMoveBehaviour(new Walking());

        System.out.println(soldier.getName());
        soldier.move();
        soldier.attack();
    }
}
