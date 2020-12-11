package Exercises.strategy;

public class Knife implements AttackBehaviour{
    @Override
    public void performAttack() {
        System.out.println("Attacking with knife");
    }
}
