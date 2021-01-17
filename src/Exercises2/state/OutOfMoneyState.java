package Exercises2.state;

public class OutOfMoneyState implements State {
    ATMMachine atmMachine;

    public OutOfMoneyState(ATMMachine atmMachine) {
        this.atmMachine = atmMachine;
    }

    @Override
    public void insertCard(String cardnumber) {
        System.out.println("Out of Service");
    }

    @Override
    public void ejectCard() {
        atmMachine.setState(atmMachine.outOfMoneyState);
        System.out.println("Have a nice day");
    }

    @Override
    public void insertPin(String pin) {
        System.out.println("Out of Service");
    }

    @Override
    public void requestCash(int amount) {
        System.out.println("There is no money in ATM");
    }
}
