package Exercises2.state;

public class OutOfMoneyState implements State {
    ATMMachine atmMachine;

    public OutOfMoneyState(ATMMachine atmMachine) {
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
        System.out.println("Pin has already inserted");
    }

    @Override
    public void requestCash(int amount) {
        System.out.println("There is no money in ATM");
    }
}
