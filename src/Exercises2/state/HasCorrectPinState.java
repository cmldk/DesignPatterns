package Exercises2.state;

public class HasCorrectPinState implements State {
    ATMMachine atmMachine;

    public HasCorrectPinState(ATMMachine atmMachine) {
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
        if (atmMachine.getCurrentAmount() == 0) {
            atmMachine.setState(atmMachine.outOfMoneyState);
            System.out.println("There is no money in ATM");
        }else if(atmMachine.getCurrentAmount() < amount){
            System.out.println("There is no enough money for " + amount + " in ATM");
            System.out.println("Current Amount: " + atmMachine.getCurrentAmount());
        }else {
            atmMachine.setCurrentAmount(atmMachine.getCurrentAmount() - amount);
            System.out.println("Given Cash Amount: " + amount);
            if (atmMachine.getCurrentAmount() == 0){
                atmMachine.setState(atmMachine.outOfMoneyState);
                System.out.println("There is no money in ATM, Out of Service");
            }
        }

    }
}
