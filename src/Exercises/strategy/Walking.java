package Exercises.strategy;

public class Walking implements MoveBehaviour{
    @Override
    public void performMove() {
        System.out.println("Walking");
    }
}
