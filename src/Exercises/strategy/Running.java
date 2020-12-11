package Exercises.strategy;

public class Running implements MoveBehaviour{
    @Override
    public void performMove() {
        System.out.println("Running");
    }
}
