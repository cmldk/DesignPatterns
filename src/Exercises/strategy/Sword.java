package Exercises.strategy;

public class Sword implements AttackBehaviour{
    @Override
    public void performAttack() {
        System.out.println("Attacking with sword");
    }
}
