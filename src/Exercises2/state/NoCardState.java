package Exercises2.state;

public class NoCardState implements State {
    ATMMachine atmMachine;

    public NoCardState(ATMMachine atmMachine) {
        this.atmMachine = atmMachine;
    }

    @Override
    public void insertCard(String cardnumber) {
        atmMachine.setState(atmMachine.hasCardState);
        System.out.println("Card inserted, card: " + cardnumber);
    }

    @Override
    public void ejectCard() {
        System.out.println("Please, insert the card");
    }

    @Override
    public void insertPin(String pin) {
        System.out.println("Please, insert the card");
    }

    @Override
    public void requestCash(int amount) {
        System.out.println("Please, insert the card");
    }
}
