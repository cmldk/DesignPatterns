package Exercises.strategy;

public class Gun implements AttackBehaviour{
    @Override
    public void performAttack() {
        System.out.println("Attacking with gun");
    }
}
