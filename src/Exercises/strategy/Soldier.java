package Exercises.strategy;

public class Soldier {
    String name;

    AttackBehaviour attackBehaviour;
    MoveBehaviour moveBehaviour;

    public void setAttackBehaviour(AttackBehaviour attackBehaviour) {
        this.attackBehaviour = attackBehaviour;
    }

    public void setMoveBehaviour(MoveBehaviour moveBehaviour) {
        this.moveBehaviour = moveBehaviour;
    }

    public Soldier(String name) {
        this.name = name;
    }


    public void attack(){
        attackBehaviour.performAttack();
    }

    public String getName() {
        return name;
    }

    public void move(){
        moveBehaviour.performMove();
    }
}
