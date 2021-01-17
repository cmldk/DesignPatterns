package Exercises2.state;

public class HasCardState implements State {
    ATMMachine atmMachine;

    public HasCardState(ATMMachine atmMachine) {
        this.atmMachine = atmMachine;
    }

    @Override
    public void insertCard(String cardnumber) {
        System.out.println("Card has already inserted");
    }

    @Override
    public void ejectCard() {
        atmMachine.setState(atmMachine.noCardState);
        System.out.println("Have a nice day");
    }

    @Override
    public void insertPin(String pin) {
        atmMachine.setState(atmMachine.hasCorrectPinState);
        System.out.println("Correct " + pin + ", welcome");
    }

    @Override
    public void requestCash(int amount) {
        System.out.println("Please, insert the pin");
    }
}
